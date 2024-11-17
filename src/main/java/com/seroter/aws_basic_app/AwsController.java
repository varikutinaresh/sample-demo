package com.seroter.aws_basic_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class AwsController {

@GetMapping("/msg")
    public String getMessage(){
        return "aws demo app";
    }

}
