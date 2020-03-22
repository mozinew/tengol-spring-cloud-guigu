package com.tengol.springcloud.guigu.service.impl;

import com.tengol.springcloud.guigu.entity.Payment;
import com.tengol.springcloud.guigu.dao.mapper.PaymentMapper;
import com.tengol.springcloud.guigu.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * PaymentServiceImpl
 *
 * @author dongrui
 * @date 2020/3/20 23:09
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentMapper paymentMapper;

    public PaymentServiceImpl(PaymentMapper paymentMapper) {
        this.paymentMapper = paymentMapper;
    }

    @Override
    public int save(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment selectByPrimaryKey(Integer id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
