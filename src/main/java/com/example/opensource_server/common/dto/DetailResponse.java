package com.example.opensource_server.common.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DetailResponse {
    private Integer code;
    private String message;
}