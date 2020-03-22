package com.tengol.springcloud.guigu.service;

import com.tengol.springcloud.guigu.dao.entity.Payment;

/**
 * PaymentService
 *
 * @author dongrui
 * @date 2020/3/20 23:08
 */
public interface PaymentService {
    int save(Payment payment);

    Payment selectByPrimaryKey(Integer id);
}
