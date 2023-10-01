package com.pk.springwiremock.service.serviceImpl;

import com.pk.springwiremock.config.RestHelper;
import com.pk.springwiremock.dto.UserDto;
import com.pk.springwiremock.service.DataService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Patrick Muriithi
 * @created 10/1/2023 - 12:10 PM
 * @project spring-wiremock
 */
@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    @Value("${api.url}")
    private String apiUrl;

    private final RestHelper restHelper;

    @Override
    public UserDto[] getData() {
        try {
            return  restHelper.getRequest(apiUrl + "/users").getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error occurred while fetching data");
        }

    }
}
