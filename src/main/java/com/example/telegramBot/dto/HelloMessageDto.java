package com.example.telegramBot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloMessageDto {
    private MUserProfile userProfile;
    private String message;
}
