package com.example.timeservice.mapper.model;

import com.example.timeservice.dto.DateTimeDto;
import com.example.timeservice.mapper.DateTimeMapper;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;

// реализация интерфейса маппера DateTimeMapper
public class DateTimeMapperImpl implements DateTimeMapper {
    @Override
    public DateTimeDto fromDate(OffsetDateTime currentTime, ZoneId zoneId, String timeString) {
        int year = currentTime.getYear();
        int month = currentTime.getMonthValue();
        int day = currentTime.getDayOfMonth();
        int hour = currentTime.getHour();
        int minutes = currentTime.getMinute();
        int seconds = currentTime.getSecond();
        Date date = Date.from(currentTime.toInstant());
        return new DateTimeDto(zoneId.toString(), year, month, day, hour, minutes, seconds, date, timeString);
    }
}
