package com.pk.springwiremock.controller;

import com.pk.springwiremock.dto.UserDto;
import com.pk.springwiremock.service.DataService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Patrick Muriithi
 * @created 10/1/2023 - 12:02 PM
 * @project spring-wiremock
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final DataService dataService;



    @GetMapping("/fetch-data")
    public UserDto[] fetchData() {
        return dataService.getData();
    }
}
