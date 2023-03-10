package com.wa.feign.fallback;

import com.wa.feign.AppFeignClient;
import com.wa.model.app.AppAddRequest;
import com.wa.model.app.AppDetailResponse;
import org.springframework.stereotype.Component;

/**
 * AppFeignHystrix
 * 2023/3/10 9:52 上午
 *
 * @author wuao
 */

@Component
public class AppFeignHystrix implements AppFeignClient {

    @Override
    public void add(AppAddRequest request) {
        System.out.println("app add hystrix fallback");
    }

    @Override
    public AppDetailResponse get() {
        System.out.println("app get hystrix fallback");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("app delete hystrix fallback");
    }
}
