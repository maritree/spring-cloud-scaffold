package com.maritree.authority.buss.service;

import com.maritree.authority.buss.entity.User;
import com.maritree.authority.buss.mapper.UserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author maritree
 * @since 2018-08-11
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}

