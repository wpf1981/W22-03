package com.example.w2203.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
//@RequestMapping("/")
public class PageController {
    //登录页面，未设置
    @RequestMapping("/")
    public String login() {
        return "index";
    }
}
