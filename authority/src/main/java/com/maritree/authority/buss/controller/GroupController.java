package com.maritree.authority.buss.controller;

import com.maritree.authority.buss.entity.Group;
import com.maritree.authority.buss.service.GroupService;
import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 * 系统分组表 RestFul接口
 *
 * @author maritree
 * @since 2018-06-29
 */
@RestController
@RequestMapping("/group")
public class GroupController {
    Logger logger = LoggerFactory.getLogger(GroupController.class);

    @Autowired
    GroupService groupService;


    @PostMapping("/insert")
    public Object insert(@RequestBody Group group) {
        groupService.insert(group);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        groupService.deleteById(id);
        return Result.genSuccessResult();

    }

    @PostMapping("/update")
    public Object update(@RequestBody Group group) {
        groupService.updateById(group);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<Group> groupList = groupService.selectList(null);
        return Result.genSuccessResult(groupList);
    }

}

