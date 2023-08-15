package com.szq.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentFeignService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------------PaymentFallbackService fall back-paymentInfo_Ok,(*^▽^*)";
    }


    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--------------PaymentFallbackService fall back-paymentInfo_TimeOut，o(╥﹏╥)o";
    }
}
