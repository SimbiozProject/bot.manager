package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.StatisticUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticUserRepository extends JpaRepository<StatisticUser, Long> {

    List<StatisticUser> findAllByActiveTrue();
}
