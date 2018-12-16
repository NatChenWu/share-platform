package com.example.shareplatform.api.common.dao;

import com.example.shareplatform.api.common.entities.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
