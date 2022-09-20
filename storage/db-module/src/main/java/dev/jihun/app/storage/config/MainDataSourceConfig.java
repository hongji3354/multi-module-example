package dev.jihun.app.storage.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "dev.jihun.datasource.main")
    public HikariConfig mainHikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public HikariDataSource mainDataSource() {
        return new HikariDataSource(mainHikariConfig());
    }
}
