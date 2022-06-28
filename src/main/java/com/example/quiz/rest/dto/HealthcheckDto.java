package com.example.quiz.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HealthcheckDto {

    private boolean status;
    private String messages;

}
