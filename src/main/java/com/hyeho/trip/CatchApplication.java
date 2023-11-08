package com.hyeho.trip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.hyeho.trip")
public class CatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatchApplication.class, args);
    }
}
