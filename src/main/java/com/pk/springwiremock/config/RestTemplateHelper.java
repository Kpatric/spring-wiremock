package com.pk.springwiremock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author Patrick Muriithi
 * @created 10/1/2023 - 12:06 PM
 * @project spring-wiremock
 */
@Configuration
public class RestTemplateHelper {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
