package com.example.timeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DateTimeDto {
    @Schema(description = "Часовой пояс сервера")
    private String timeZone;

    @Schema(description = "Год текущего времени")
    private int year;

    @Schema(description = "Месяц текущего времени")
    private int month;

    @Schema(description = "День текущего времени")
    private int day;

    @Schema(description = "Час текущего времени")
    private int hour;

    @Schema(description = "Минуты текущего времени")
    private int minutes;

    @Schema(description = "Секунды текущего времени")
    private int seconds;

    @Schema(description = "Объект типа Date, представляющий текущее время")
    private Date date;

    @Schema(description = "Строковое представление текущего времени")
    private String dateString;


}
