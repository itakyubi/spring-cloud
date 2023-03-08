package com.wa.controller;

import com.wa.feign.AppFeignClient;
import com.wa.model.app.AppAddRequest;
import com.wa.model.app.AppDetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AppFeignController
 * 2023/3/6 7:15 下午
 *
 * @author wuao
 */

@RequestMapping("/feign")
@RestController
public class AppFeignController {

    // 作用就是让调其他http服务的操作，变成跟调本地方法一样
    @Autowired
    private AppFeignClient appFeignClient;

    @PostMapping("/add")
    public void add(@RequestBody AppAddRequest request) {
        appFeignClient.add(request);
    }

    @GetMapping("/get")
    public AppDetailResponse get() {
        return appFeignClient.get();
    }

    @DeleteMapping("/delete")
    public void delete() {
        appFeignClient.delete();
    }
}
