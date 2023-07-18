package com.example.swaggertemplate.controller;

import com.example.swaggertemplate.dto.TestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name : TestController
 * @author : Mo-Greene
 * @date : 2023/07/18
 * 스웨거 테스트
 */
@RestController
public class TestController {

    @GetMapping("/api")
    @Operation(summary = "Swagger 테스트", description = "스웨거 테스트")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Fail")
    })
    public void api(TestDTO testDTO) {
        System.out.println("testDTO = " + testDTO);
    }
}
