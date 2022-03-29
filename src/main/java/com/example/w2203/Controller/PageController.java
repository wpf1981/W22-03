package com.example.w2203.Controller;

import com.example.w2203.Ajax.Response;
import com.example.w2203.Entity.TestTab;
import com.example.w2203.Repository.TestRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/t1")
@Api(tags = "测试用接口")
public class PageController {
    @Resource
    TestRepository testRepository;
    //登录页面，未设置
    @GetMapping("/tt")
    @ApiOperation("获取所有数据")
    public List<TestTab> findUserList(){
        return testRepository.findAll();
    }

    @GetMapping("/tt/{id}")
    @ApiOperation("获取指定数据")
    public Optional<TestTab> findUser(@PathVariable("id") String userid){
        log.info(userid);
        return testRepository.findById(userid);
    }

    @PostMapping(value = "/tt")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "id",value = "编号",required = true,paramType = "query"),
             @ApiImplicitParam(name = "name",value = "名称",required = true,paramType = "query")
            }    )
    @ApiOperation("添加新数据")
    public TestTab addUser(@RequestParam("id") String userid,
                           @RequestParam("name") String username){
        TestTab user = new TestTab();
        user.setUserId(userid);
        user.setUserName(username);
        return testRepository.save(user);
    }

    @PutMapping("/tt")
    @ApiOperation("更新指定数据")
    public TestTab updateUser(@RequestBody TestTab testTab){
        log.info("ok:"+testTab);
        return testRepository.save(testTab);
    }

    @DeleteMapping("/tt/{id}")
    @ApiOperation("删除指定数据")
    public Response deleteUser(@PathVariable("id") String userid){
        log.info("ok:"+userid);
        testRepository.deleteById(userid);
        return Response.success();
    }


}

