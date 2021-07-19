package com.example.telegramBot.service;

import com.example.telegramBot.repository.entity.StatisticUser;

import java.util.List;
import java.util.Optional;

public interface StatisticUserService {
    void save(StatisticUser statisticUser);

    List<StatisticUser> retrieveAllActiveUsers();

    Optional<StatisticUser> findByChatId(Long chatId);
}
