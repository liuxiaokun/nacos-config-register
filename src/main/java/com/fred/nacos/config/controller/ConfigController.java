package com.fred.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @date 2019-04-25
 * @version 1.0.0
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.name}")
    private String name;

    @GetMapping
    public String getConfig() {
        return name;
    }
}
