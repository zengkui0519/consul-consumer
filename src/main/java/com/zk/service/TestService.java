package com.zk.service;

import com.zk.dao.TestDao;
import com.zk.model.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    private TestDao testDao;

    public Test getTestInfo(Long testId) {
        return testDao.getTestInfoById(testId);
    }

}
