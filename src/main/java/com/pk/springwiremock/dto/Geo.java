package com.pk.springwiremock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Patrick Muriithi
 * @created 10/1/2023 - 12:17 PM
 * @project spring-wiremock
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geo {
    private String lat;
    private String lng;
}
