package com.wa.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AppAddRequest
 * 2023/3/2 10:08 上午
 *
 * @author wuao
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppAddRequest {
    private int id;
    private String name;
}
