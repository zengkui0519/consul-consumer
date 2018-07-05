package com.zk.service;

import com.zk.feign.TestFeign;
import com.zk.model.Test;
import com.zk.vo.ResponseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestFeignService {

    @Resource
    private TestFeign testFeign;

    public ResponseVo<Test> getTestInfo(Long testId) {
        return testFeign.getTestInfo(testId);
    }

}
