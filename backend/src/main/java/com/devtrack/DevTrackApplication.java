package com.devtrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Main entry point for the DevTrack Enterprise Project Management System.
 */
@SpringBootApplication
public class DevTrackApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DevTrackApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DevTrackApplication.class, args);
    }
}

