package com.zk.web;

import com.zk.model.Test;
import com.zk.service.TestFeignService;
import com.zk.vo.ResponseVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/feign")
public class TestFeignController {

    @Resource
    private TestFeignService feignService;

    @ApiOperation("获取测试信息")
    @GetMapping("/getTestInfo/{testId}")
    public ResponseVo<Test> getTestInfo(@PathVariable Long testId) {
        Test test = feignService.getTestInfo(testId).getData();
        return new ResponseVo<>(test);
    }

}

