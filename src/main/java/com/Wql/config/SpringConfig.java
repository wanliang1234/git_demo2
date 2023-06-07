package com.Wql.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.Wql.service")
@PropertySource("classpath:user.properties")
@Import({JdbcConfig.class,MybitisConfig.class})
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringConfig
{

}
