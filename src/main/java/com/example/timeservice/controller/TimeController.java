package com.example.timeservice.controller;


import com.example.timeservice.dto.DateTimeDto;
import com.example.timeservice.service.TimeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
@Tag(name = "Time API", description = "API для получения текущего времени")
public class TimeController {

    private final TimeService timeService;

    @Operation(summary = "Получить текущее время", description = "Метод возвращает текущее время сервера с указанием таймзоны.")
    @GetMapping("/time")
    public ResponseEntity<DateTimeDto> getTime() {
        return ResponseEntity.ok(timeService.getTimeNow());
    }

}