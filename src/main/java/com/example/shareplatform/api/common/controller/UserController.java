package com.example.shareplatform.api.common.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.shareplatform.api.common.entities.User;
import com.example.shareplatform.api.common.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author weiyb
 * @since 2018-12-16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("get")
    public User get(){
        User user = userService.getById(1);
        return user;
    }
    @RequestMapping("list")
    public IPage<User> list(){
        IPage<User> page = userService.page(new Page<User>(2, 2));
        return page;
    }
}

