package hackathon.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://roundhouse.proxy.rlwy.net:54969/railway");
        dataSource.setUsername("postgres");
        dataSource.setPassword("BXxWEqtpotoImHysLRCtgeJrTuiBVHNv");
        return dataSource;
    }
}
