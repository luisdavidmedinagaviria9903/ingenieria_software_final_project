package com.ingenieria.software.demo.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {
    "com.ingenieria.software.demo.domain",
}
)
@EnableJpaRepositories(basePackages = {"com.ingenieria.software.demo.repository"})
@ComponentScan(basePackages = {
    "com.ingenieria.software.demo.mapper",
})
public class ScanCommonConfiguration {
}
