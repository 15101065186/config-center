package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: libo
 * @Mail: libo@sudiyi.cn
 * @Date: 2018/9/19 17:59
 * @Version: 1.1.5
 * @Description:
 */
@RestController
@RefreshScope
public class HahaController {

    @Value("${profiles}")
    private String profile;

    @GetMapping("/get")
    public String get(){
        return this.profile;
    }
}
