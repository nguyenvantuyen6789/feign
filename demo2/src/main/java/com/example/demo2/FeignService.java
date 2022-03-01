package com.example.demo2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url = "http://localhost:8080/user")
public interface FeignService {

    @GetMapping("name")
    public String getData();

}
