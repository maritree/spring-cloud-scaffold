package com.maritree.authority.buss.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.maritree.authority.buss.entity.GroupResource;
import com.maritree.authority.buss.entity.Resource;
import com.maritree.authority.buss.service.GroupResourceService;
import com.maritree.authority.buss.service.ResourceService;
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
 * 分组资源表 RestFul接口
 *
 * @author maritree
 * @since 2018-06-29
 */
@RestController
@RequestMapping("/groupResource")
public class GroupResourceController {
    Logger logger = LoggerFactory.getLogger(GroupResourceController.class);

    @Autowired
    GroupResourceService groupResourceService;
    @Autowired
    ResourceService resourceService;


    @PostMapping("/insert")
    public Object insert(@RequestBody GroupResource groupResource) {
        groupResourceService.insert(groupResource);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        groupResourceService.deleteById(id);
        return Result.genSuccessResult();

    }

    @PostMapping("/update")
    public Object update(@RequestBody GroupResource groupResource) {
        groupResourceService.updateById(groupResource);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<GroupResource> groupResourceList = groupResourceService.selectList(null);
        return Result.genSuccessResult(groupResourceList);
    }

    @PostMapping("/getResourceByGroups")
    public Object getResourceByGroups(@RequestBody List<String> groups) {
        if (CollectionUtils.isEmpty(groups)) {
            return Result.genSuccessResult();
        }
        EntityWrapper<GroupResource> groupResourceEntityWrapper = new EntityWrapper<>();
        groupResourceEntityWrapper.in("group_id", groups);
        List<GroupResource> groupResourceList = groupResourceService.selectList(groupResourceEntityWrapper);

        EntityWrapper<Resource> resourceEntityWrapper = new EntityWrapper<>();
        resourceEntityWrapper.in("id", groupResourceList.stream().map(GroupResource::getResourceId).collect(Collectors.toList()));
        List<Map<String, Object>> resourceList = resourceService.selectMaps(resourceEntityWrapper);
        return Result.genSuccessResult(resourceList);
    }
}

