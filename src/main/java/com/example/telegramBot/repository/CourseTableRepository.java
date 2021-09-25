package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.CourseTable;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface CourseTableRepository extends JpaRepository<CourseTable, Long> {
}
