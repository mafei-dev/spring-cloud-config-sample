package com.confi.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
@Profile("dev")// this end point only for dev
public class InfoController {


    @Value("${test.message: Default message}")
    public String message;

    @GetMapping("/info")
    public Object index() {
        System.out.println("InfoController.index");
        return message;
    }

}
