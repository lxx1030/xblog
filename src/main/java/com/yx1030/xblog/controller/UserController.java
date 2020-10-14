package com.yx1030.xblog.controller;

import com.yx1030.xblog.pojo.User;
import com.yx1030.xblog.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer id){
        return userService.getUserById(id);
    }

}
