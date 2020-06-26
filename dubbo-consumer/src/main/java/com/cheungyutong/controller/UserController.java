package com.cheungyutong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cheungyutong.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cheungyutong
 * @Date 2020/6/26 17:35
 */
@RestController
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @GetMapping("/hi")
    public String sayHi(){
        return userService.sayHi();
    }
}
