package com.maritree.authority.buss.controller;

import com.maritree.authority.buss.entity.Resource;
import com.maritree.authority.buss.service.ResourceService;
import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 * 系统资源表 RestFul接口
 *
 * @author maritree
 * @since 2018-06-29
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {
    Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    ResourceService resourceService;


    @PostMapping("/insert")
    public Object insert(@RequestBody Resource resource) {
        resourceService.insert(resource);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        resourceService.deleteById(id);
        return Result.genSuccessResult();

    }

    @PostMapping("/update")
    public Object update(@RequestBody Resource resource) {
        resourceService.updateById(resource);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<Resource> resourceList = resourceService.selectList(null);
        return Result.genSuccessResult(resourceList);
    }

}

