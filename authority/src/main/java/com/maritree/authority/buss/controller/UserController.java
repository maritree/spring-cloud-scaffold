package com.maritree.authority.buss.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.maritree.authority.buss.entity.GroupUser;
import com.maritree.authority.buss.entity.User;
import com.maritree.authority.buss.service.GroupUserService;
import com.maritree.authority.buss.service.UserService;
import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 系统用户表,loginname和departid唯一 RestFul接口
 *
 * @author maritree
 * @since 2018-06-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;
    @Autowired
    GroupUserService groupUserService;


    @PostMapping("/insert")
    public Object insert(@RequestBody User user) {
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
    public Object loadUserInfoByUsername(@RequestParam String loginName) {
        EntityWrapper<User> userEntityWrapper = new EntityWrapper<>();
        userEntityWrapper.eq("login_name", loginName);
        Map<String, Object> userMap = userService.selectMap(userEntityWrapper);

        EntityWrapper<GroupUser> groupUserEntityWrapper = new EntityWrapper<>();
        groupUserEntityWrapper.eq("user_id", userMap.get("id"));
        List<GroupUser> groupUserList = groupUserService.selectList(groupUserEntityWrapper);
        userMap.put("group", groupUserList.stream().map(GroupUser::getGroupId).collect(Collectors.toList()));
        return Result.genSuccessResult(userMap);
    }

}

