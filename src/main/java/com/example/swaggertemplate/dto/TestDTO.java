package com.example.swaggertemplate.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestDTO {

    @Schema(description = "Swagger Content", example = "swagger example")
    private String content;
}
