package com.example.demo.common.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.common.entities.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author weiyb
 * @since 2018-12-16
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
