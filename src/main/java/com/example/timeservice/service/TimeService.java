package com.example.timeservice.service;

import com.example.timeservice.dto.DateTimeDto;
import com.example.timeservice.mapper.DateTimeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@Service
public class TimeService {
    private final DateTimeMapper dateTimeMapper;

    public DateTimeDto getTimeNow() {
        OffsetDateTime currentTime = OffsetDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZZZ");
        String timeString = currentTime.format(formatter) + " (" + zoneId.toString() + ")";
        return dateTimeMapper.fromDate(currentTime, zoneId, timeString);
    }


}
