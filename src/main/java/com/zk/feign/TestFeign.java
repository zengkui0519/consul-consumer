package com.zk.feign;

import com.zk.api.TestApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("${provider}")
public interface TestFeign extends TestApi {

}