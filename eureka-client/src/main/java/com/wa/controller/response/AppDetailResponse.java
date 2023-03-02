package com.wa.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AppDetailResponse
 * 2023/3/2 10:08 上午
 *
 * @author wuao
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppDetailResponse {
    private int id;
    private String name;
}
