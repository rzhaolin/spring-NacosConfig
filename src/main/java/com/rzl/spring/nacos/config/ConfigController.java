package com.rzl.spring.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 开启配置自动刷新
public class ConfigController {
    @Value("${spring.redis.host}")
    private String reidsHost;

    @Value("${spring.redis.port}")
    private String reidsPort;

    @Value("${spring.redis.database}")
    private String reidsDatabase;

    @GetMapping(path = "nacos/config/getRedisConfig")
    public String getRedisConfig() {
        return "reids cofig: [ host: " + reidsHost + ", port: " + reidsPort + ", database: " + reidsDatabase + " ]";
    }
}
