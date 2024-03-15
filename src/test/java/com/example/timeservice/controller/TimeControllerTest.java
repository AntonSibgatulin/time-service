package com.example.timeservice.controller;

import com.example.timeservice.dto.DateTimeDto;
import com.example.timeservice.service.TimeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.OffsetDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TimeControllerTest {

    @Mock
    private TimeService timeService;

    private TimeController timeController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        timeController = new TimeController(timeService);
    }

    @Test
    void getTime_ReturnsOkResponseWithDateTimeDto() {
        OffsetDateTime currentTime = OffsetDateTime.now();
        DateTimeDto dateTimeDto = new DateTimeDto("UTC", currentTime.getYear(), currentTime.getMonthValue(),
                currentTime.getDayOfMonth(), currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond(), Date.from(currentTime.toInstant()),
                currentTime.toString());

        when(timeService.getTimeNow()).thenReturn(dateTimeDto);

        ResponseEntity<DateTimeDto> response = timeController.getTime();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(dateTimeDto, response.getBody());
    }
}