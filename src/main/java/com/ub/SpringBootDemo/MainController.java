package com.ub.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment env;

    @GetMapping("/test")
    public HttpEntity<String> getTest() {
        String dockerInstanceValue = env.getProperty("DOCKER_INSTANCE");
        return ResponseEntity.ok("Environment " + dockerInstanceValue);
    }
}
