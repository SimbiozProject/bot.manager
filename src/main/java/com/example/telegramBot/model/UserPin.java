package com.example.telegramBot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPin {
    private Long chatId;
    private Long idPin;
    private short pin;
}
