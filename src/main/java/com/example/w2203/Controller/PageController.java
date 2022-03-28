package com.example.w2203.Controller;

import com.example.w2203.Entity.TestTab;
import com.example.w2203.Repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
public class PageController {
    @Resource
    TestRepository testRepository;
    //登录页面，未设置
    @GetMapping("/list")
    public List<TestTab> findUserList(){
        return testRepository.findAll();
    }

    @PostMapping(value = "/user")

    public TestTab addUser(@RequestParam("id") String userid, @RequestParam("name") String username){

        TestTab user = new TestTab();
        user.setUserId(userid);
        user.setUserName(username);
        return testRepository.save(user);

    }
}

