package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.HwFromStudentTable;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface HwForStudentRepository extends JpaRepository<HwFromStudentTable, Long> {
}
