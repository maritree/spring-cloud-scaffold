package com.maritree.authority.buss.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.maritree.authority.buss.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统用户表,loginname和departid唯一 Mapper 接口
 * </p>
 *
 * @author maritree
 * @since 2018-06-29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
