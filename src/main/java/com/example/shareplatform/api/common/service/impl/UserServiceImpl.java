package com.example.shareplatform.api.common.service.impl;

import com.example.shareplatform.api.common.entities.User;
import com.example.shareplatform.api.common.dao.UserDao;
import com.example.shareplatform.api.common.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weiyb
 * @since 2018-12-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
