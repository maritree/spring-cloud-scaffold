package com.maritree.authority.buss.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.maritree.authority.buss.entity.Resource;
import com.maritree.authority.buss.entity.RoleResource;
import com.maritree.authority.buss.service.ResourceService;
import com.maritree.authority.common.response.Result;
import com.maritree.authority.buss.entity.RoleResource;
import com.maritree.authority.buss.service.RoleResourceService;

import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * RestFul接口
 *
 * @author maritree
 * @since 2018-08-11
 */
@RestController
@RequestMapping("/roleResource")
public class RoleResourceController {
    Logger logger = LoggerFactory.getLogger(RoleResourceController.class);

    @Autowired
    RoleResourceService roleResourceService;
    @Autowired
    ResourceService resourceService;


    @PostMapping("/insert")
    public Object insert(@RequestBody RoleResource roleResource) {
        roleResourceService.insert(roleResource);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        roleResourceService.deleteById(id);
        return Result.genSuccessResult();

    }

    @PostMapping("/update")
    public Object update(@RequestBody RoleResource roleResource) {
        roleResourceService.updateById(roleResource);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<RoleResource> roleResourceList = roleResourceService.selectList(null);
        return Result.genSuccessResult(roleResourceList);
    }

    @PostMapping("/getResourceByRoles")
    public Object getResourceByRoles(@RequestBody List<String> roles) {
        if (CollectionUtils.isEmpty(roles)) {
            return Result.genSuccessResult();
        }
        EntityWrapper<RoleResource> roleResourceEntityWrapper = new EntityWrapper<>();
        roleResourceEntityWrapper.in("role_id", roles);
        List<RoleResource> roleResourceList = roleResourceService.selectList(roleResourceEntityWrapper);

        EntityWrapper<Resource> resourceEntityWrapper = new EntityWrapper<>();
        if (CollectionUtils.isEmpty(roleResourceList)) {
            return Result.genSuccessResult();
        }
        resourceEntityWrapper.in("id", roleResourceList.stream().map(RoleResource::getResourceId).collect(Collectors.toList()));
        List<Map<String, Object>> resourceList = resourceService.selectMaps(resourceEntityWrapper);
        return Result.genSuccessResult(resourceList);
    }
}

