package com.wa.feign;

import com.wa.feign.fallback.AppFeignHystrix;
import com.wa.model.app.AppAddRequest;
import com.wa.model.app.AppDetailResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * AppFeignClient
 * 2023/3/6 6:52 下午
 *
 * @author wuao
 */

@FeignClient(name = "feign", url = "http://localhost:7999",
        path = "/v1/apps", fallback = AppFeignHystrix.class)
public interface AppFeignClient {

    @PostMapping("/add")
    void add(@RequestBody AppAddRequest request);

    @GetMapping("/get")
    AppDetailResponse get();

    @DeleteMapping("/delete")
    void delete();
}
