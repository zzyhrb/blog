package com.zzy.blog.controller;

import com.zzy.blog.pojo.User;
import com.zzy.blog.service.user.IUserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private IUserServiceImpl userService;
    @ResponseBody
    @GetMapping("getUser/{id}")
    @ApiOperation(value="根据ID获取用户信息")
    public User getUser(@PathVariable("id") Long id){

        return userService.getUser(id);
    }
}
