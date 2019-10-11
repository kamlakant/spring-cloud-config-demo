package com.cloud.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigClient {

    @Autowired
    private Environment env;

    Logger logger = LoggerFactory.getLogger(ConfigClient.class);

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @PostConstruct
    private void init() {
        logger.info(env.getProperty("app-env"));
        logger.info(env.getProperty("generic-info"));
    }
}