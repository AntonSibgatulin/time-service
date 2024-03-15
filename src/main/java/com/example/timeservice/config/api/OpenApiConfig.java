package com.example.timeservice.config.api;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Сервис времени сервера")
                        .version("1.0.0")
                        .description("Сервис предоставляет текущее время сервера с точностью до секунд, с указанием таймзоны."));
    }
}