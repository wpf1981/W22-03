package com.example.w2203.Controller;

import com.example.w2203.Repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/t2")
@Api(tags = "用户接口")
public class UserController {
    @Resource
    UserRepository userRepository;

}
