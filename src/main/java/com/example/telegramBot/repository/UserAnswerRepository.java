package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.UserAnswerTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswerTable, Long> {

    UserAnswerTable findByUserName(String userName);
}
