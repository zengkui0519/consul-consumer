package com.zk.dao;

import com.zk.model.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    Test getTestInfoById(Long testId);

}