package com.nelson.org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @auther 1301913120@qq.com
 * @create 2019-06-20 15:39
 * @todo
 */


@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }
}