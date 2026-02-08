package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:5173",                 // local dev (Vite)
                        "http://localhost:3000",                 // local dev (CRA)
                        "https://react-frontend-sample.vercel.app" // deployed frontend (no trailing slash!)
                )
                .allowedMethods("*")   // allow all HTTP methods
                .allowedHeaders("*");  // allow all headers
    }
}