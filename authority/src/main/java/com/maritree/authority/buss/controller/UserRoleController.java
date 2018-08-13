package com.maritree.authority.buss.controller;

import com.maritree.authority.buss.entity.UserRole;
import com.maritree.authority.buss.service.UserRoleService;

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
@RequestMapping("/userRole")
public class UserRoleController {
    Logger logger = LoggerFactory.getLogger(UserRoleController.class);

    @Autowired
    UserRoleService userRoleService;


    @PostMapping("/insert")
    public Object insert(@RequestBody UserRole userRole) {
        userRoleService.insert(userRole);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        userRoleService.deleteById(id);
        return Result.genSuccessResult();

    }
    @PostMapping("/update")
    public Object update(@RequestBody UserRole userRole) {
        userRoleService.updateById(userRole);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<UserRole> userRoleList = userRoleService.selectList(null);
        return Result.genSuccessResult(userRoleList);
    }

}

