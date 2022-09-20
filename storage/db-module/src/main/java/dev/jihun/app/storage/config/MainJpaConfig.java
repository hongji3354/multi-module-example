package dev.jihun.app.storage.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "dev.jihun.app.storage")
@EnableJpaRepositories(basePackages = "dev.jihun.app.storage")
public class MainJpaConfig {
}
