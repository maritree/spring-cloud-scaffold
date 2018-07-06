package com.maritree.authority.buss.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.maritree.authority.buss.entity.User;
import com.maritree.authority.buss.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表,loginname和departid唯一 服务实现类
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}

