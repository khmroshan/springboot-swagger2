package com.example.swagger2.swagger_two_example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	
	@ApiOperation("Return Hello World: Get Method")
	@ApiResponses(value = {
	        @ApiResponse(code = 100, message = "Some Custom Message"),
	        @ApiResponse(code = 500, message = "Internal Server Error")})
	@GetMapping("/get")
	public String getMethod() {
		return "hello world";
	}
	
	@ApiOperation("Return Submitted Data: Post Method")
	@PostMapping("/post")
	public String postMethod(@RequestBody String data) {
		return "you submitted : "+data;
	}
	
	
	

}
