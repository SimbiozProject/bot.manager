package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.GroupTable;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface GroupTableRepository extends JpaRepository<GroupTable, Long> {
}
