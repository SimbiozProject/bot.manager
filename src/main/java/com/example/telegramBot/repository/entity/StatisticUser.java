package com.example.telegramBot.repository.entity;

import lombok.Data;

@Data
//@Entity
////Table(name = "statistic_user")
public class StatisticUser {
//    //@Id
//    // @Column(name = "chat_id")
    private Long chatId;

//    // @Column(name = "active")
    private boolean active;


}
