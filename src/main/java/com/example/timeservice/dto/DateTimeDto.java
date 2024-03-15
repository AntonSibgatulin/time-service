package com.example.timeservice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class DateTimeDto {
    private String timeZone;
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minutes;
    private String seconds;

    private Date date;
    private String dateString;

}
