package com.maritree.authority.buss.controller;

import com.maritree.authority.buss.entity.Role;
import com.maritree.authority.buss.service.RoleService;

import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 *
 *  RestFul接口
 *
 *
 * @author maritree
 * @since 2018-08-11
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    RoleService roleService;


    @PostMapping("/insert")
    public Object insert(@RequestBody Role role) {
        roleService.insert(role);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        roleService.deleteById(id);
        return Result.genSuccessResult();

    }
    @PostMapping("/update")
    public Object update(@RequestBody Role role) {
        roleService.updateById(role);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<Role> roleList = roleService.selectList(null);
        return Result.genSuccessResult(roleList);
    }

}

