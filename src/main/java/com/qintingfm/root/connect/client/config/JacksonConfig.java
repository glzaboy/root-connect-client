package com.qintingfm.root.connect.client.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    @Bean
    ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }
}
