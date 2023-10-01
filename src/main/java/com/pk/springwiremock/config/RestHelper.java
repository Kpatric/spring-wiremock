package com.pk.springwiremock.config;

import com.pk.springwiremock.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author Patrick Muriithi
 * @created 10/1/2023 - 12:21 PM
 * @project spring-wiremock
 */
@AllArgsConstructor
@Component
public class RestHelper {

    private final RestTemplateHelper restTemplateHelper;

    public ResponseEntity<UserDto[]> getRequest(String url) {
        return restTemplateHelper.restTemplate().getForEntity(url, UserDto[].class);
    }

}
