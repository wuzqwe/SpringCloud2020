package com.szq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacosMain85
{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain85.class, args);
    }
}
 
 

