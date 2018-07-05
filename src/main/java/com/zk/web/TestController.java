package com.zk.web;

import com.zk.model.Test;
import com.zk.vo.ResponseVo;
import com.zk.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @ApiOperation("获取测试信息")
    @GetMapping("/getTestInfoById/{testId}")
    public ResponseVo<Test> getTestInfoById(@PathVariable Long testId) {
        Test test = testService.getTestInfo(testId);
        return new ResponseVo<>(test);
    }

}

