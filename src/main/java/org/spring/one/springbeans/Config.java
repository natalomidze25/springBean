package org.spring.one.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
