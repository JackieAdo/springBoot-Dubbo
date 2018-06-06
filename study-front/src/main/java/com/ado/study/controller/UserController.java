package com.ado.study.controller;

import com.ado.study.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jackie
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;
}
