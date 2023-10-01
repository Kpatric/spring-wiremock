package com.pk.springwiremock.service;

import com.pk.springwiremock.dto.UserDto;

/**
 * @author Patrick Muriithi
 * @created 10/1/2023 - 12:10 PM
 * @project spring-wiremock
 */
public interface DataService {
    UserDto[] getData();
}
