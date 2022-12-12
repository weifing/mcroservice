package com.pccw.springcloud.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ConfigClientController {
//    @Value("${config.info}")
//    @Value("${server.error.path}")
    private String configInfo;

    @Autowired
    private Environment environment;

    @GetMapping("/configInfo")
    public String getConfigInfo(@RequestParam("config.info") String key) {
        return environment.getProperty(key);
    }
}