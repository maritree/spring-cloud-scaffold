package com.maritree.authority.buss.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.maritree.authority.buss.entity.User;
import com.maritree.authority.buss.entity.UserRole;
import com.maritree.authority.buss.service.UserRoleService;
import com.maritree.authority.buss.service.UserService;
import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;
    @Autowired
    UserRoleService userRoleService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @PostMapping("/insert")
    public Object insert(@RequestBody User user) {
        user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
        userService.insert(user);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        userService.deleteById(id);
        return Result.genSuccessResult();

    }

    @PostMapping("/update")
    public Object update(@RequestBody User user) {
        userService.updateById(user);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<User> userList = userService.selectList(null);
        return Result.genSuccessResult(userList);
    }

    @GetMapping("/loadUserInfoByUsername")
    public Result<Map<String, Object>> loadUserInfoByUsername(@RequestParam String userName) {
        try {
            EntityWrapper<User> userEntityWrapper = new EntityWrapper<>();
            userEntityWrapper.eq("user_name", userName);
            Map<String, Object> userMap = userService.selectMap(userEntityWrapper);
            EntityWrapper<UserRole> userRoleEntityWrapper = new EntityWrapper<>();
            userRoleEntityWrapper.eq("user_id", userMap.get("id"));
            List<UserRole> userRoleList = userRoleService.selectList(userRoleEntityWrapper);
            userMap.put("roles", userRoleList.stream().map(UserRole::getRoleId).collect(Collectors.toList()));
            return Result.genSuccessResult(userMap);
        } catch (Exception e) {
            return Result.genFailResult("no such user");
        }
    }
}

