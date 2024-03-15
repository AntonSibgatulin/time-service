package com.example.timeservice.config.mapper;

import com.example.timeservice.mapper.DateTimeMapper;
import com.example.timeservice.mapper.model.DateTimeMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MapperConfig {

    // инициализация di DateTime mapper singleton
    @Bean
    public DateTimeMapper DateTime() {
        return new DateTimeMapperImpl();
    }
}
