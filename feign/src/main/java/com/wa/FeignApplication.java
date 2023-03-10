package com.wa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * FeignApplication
 * 2023/3/6 7:36 下午
 *
 * @author wuao
 */

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
