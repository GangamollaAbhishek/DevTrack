package com.devtrack.common.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Logs database connectivity status to the console on application startup.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class DatabaseConnectionLogger implements ApplicationRunner {

    private final DataSource dataSource;

    @Override
    public void run(ApplicationArguments args) {
        try (Connection connection = dataSource.getConnection()) {
            if (connection.isValid(5)) {
                log.info("Database connected successfully! (Catalog: {}, URL: {})",
                        connection.getCatalog(),
                        connection.getMetaData().getURL());
            } else {
                log.error("Database connection check failed: connection is not valid.");
            }
        } catch (SQLException ex) {
            log.error("Database connection failed: {}", ex.getMessage());
        }
    }
}

