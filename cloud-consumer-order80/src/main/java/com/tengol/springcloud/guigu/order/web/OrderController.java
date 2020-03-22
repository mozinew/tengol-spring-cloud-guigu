package com.tengol.springcloud.guigu.order.web;

import com.tengol.springcloud.guigu.commons.common.RestResult;
import com.tengol.springcloud.guigu.dao.entity.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * OrderController - 订单页面请求，转调支付模块 repayment8001
 *
 * @author dongrui
 * @date 2020/3/22 21:31
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final String PAYMENT_HOST="http://localhost:8001";

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/{id}", name = "根据主键ID查询支付信息")
    public ResponseEntity<RestResult> findPayment(@PathVariable("id") Integer id){
        RestResult result = restTemplate.getForObject(PAYMENT_HOST + "/payment/" + id, RestResult.class);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/", name = "新增支付记录")
    public ResponseEntity<RestResult> addPayment(Payment payment){
        String url = PAYMENT_HOST + "/payment/";
        RestResult restResult = restTemplate.postForObject(url, payment, RestResult.class);
        return ResponseEntity.ok(restResult);
    }
}
