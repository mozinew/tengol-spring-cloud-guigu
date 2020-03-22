package com.tengol.springcloud.guigu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Payment
 *
 * @author dongrui
 * @date 2020/3/20 22:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    /**
     * 主键 ID
     */
    private Integer id;
    /**
     * 序列号
     */
    private String serial;
}
