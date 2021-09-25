package com.example.telegramBot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MUserProfile{
    private String created;
    private Long idUserProfile;
    private Long chatId;
    private String userName;
}
