package com.wa.controller;

import com.wa.controller.request.AppAddRequest;
import com.wa.controller.response.AppDetailResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AppController
 * 2023/3/2 9:57 上午
 *
 * @author wuao
 */

@RequestMapping("/v1/apps")
@RestController
public class AppController {

    /**
     * TODO 以下接口路径都不遵循restful风格
     */

    @PostMapping("/add")
    public void add(@RequestBody AppAddRequest request) {
        System.out.println("app add");
    }

    @GetMapping("/get")
    public AppDetailResponse get() {
        System.out.println("app get");
        return new AppDetailResponse();
    }

    @DeleteMapping("/delete")
    public void delete() {
        System.out.println("app delete");
    }
}
