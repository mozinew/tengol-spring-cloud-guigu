package com.tengol.springcloud.guigu.web;

import com.tengol.springcloud.guigu.common.RestResult;
import com.tengol.springcloud.guigu.entity.Payment;
import com.tengol.springcloud.guigu.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * PaymentController
 *
 * @author dongrui
 * @date 2020/3/20 23:11
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping(value = "/", name = "新增记录")
    public ResponseEntity<RestResult> save(Payment payment) {
        int count = paymentService.save(payment);
        if (count > 0) {
            return ResponseEntity.ok(RestResult.success());
        } else {
            return ResponseEntity.ok(RestResult.fail());
        }
    }

    @GetMapping(value = "/{id}", name = "主键查询")
    public ResponseEntity<RestResult> selectByPrimaryKey(@PathVariable("id") Integer id) {
        Payment payment = paymentService.selectByPrimaryKey(id);
        return ResponseEntity.ok(RestResult.success(payment));
    }
}
