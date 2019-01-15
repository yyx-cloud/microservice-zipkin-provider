package com.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/12/24 14:17
 */

@Component
public class BaiduHealthConfig implements HealthIndicator {
    @Override
    public Health health() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://www.baidu.com", String.class);
            return Health.up().build();
        } catch (Exception e) {
            return Health.down().withDetail("errorMessage", e.getMessage()).build();
        }
    }
}
