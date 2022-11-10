package com.ddlab.rnd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Value("${msg:Config Server is not working. Please check...}")
    private String msg;

    @Value("${basicAuth.userName:Looks like username is not available...}")
    private String authUserName;

    @Value("${basicAuth.password:Secret Agent is not available}")
    private String secretAgent;

    @GetMapping("/msg")
    public String getMsg() {
        return this.msg;
    }

    @GetMapping("/info")
    public ResponseEntity<String> getInfo() {
        return new ResponseEntity<>(authUserName, HttpStatus.OK);
    }

    @GetMapping("/secret")
    public ResponseEntity<String> getSecret() {
        return new ResponseEntity<>(secretAgent, HttpStatus.OK);
    }
}
