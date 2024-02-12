package com.openclassrooms.tourguide.configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecutorServiceConfig {
    
    @Bean
    ExecutorService executorService() {
        return Executors.newFixedThreadPool(50);
    }
}
