package com.cheungyutong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cheungyutong.service.UserService;

/**
 * @Author cheungyutong
 * @Date 2020/6/26 16:05
 * @deprecation 注意这里使用的@Service是dubbo的注解
 */
//@Service(version = "1.0.0")
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "hello dubbo!";
    }
}
