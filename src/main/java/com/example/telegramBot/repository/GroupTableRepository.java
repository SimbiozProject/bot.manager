package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.GroupTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupTableRepository extends JpaRepository<GroupTable, Long> {
}
