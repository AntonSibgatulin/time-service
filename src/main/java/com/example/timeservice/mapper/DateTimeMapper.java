package com.example.timeservice.mapper;

import com.example.timeservice.dto.DateTimeDto;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public interface DateTimeMapper {
    DateTimeDto fromDate(OffsetDateTime currentTime, ZoneId zoneId, String timeString);
}
