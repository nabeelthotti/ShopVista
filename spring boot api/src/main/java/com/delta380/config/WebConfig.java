package com.delta380.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allows CORS requests to all endpoints
                .allowedOrigins("http://localhost:3000") // Allows requests from this origin. Adjust this to match the URL of your frontend application.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Specifies allowed HTTP methods
                .allowedHeaders("*") // Allows all headers
                .allowCredentials(true); // Supports credentials like cookies, authorization headers, etc.
    }
}

