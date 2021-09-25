package com.example.telegramBot.repository;

import com.example.telegramBot.repository.entity.HwFromStudentTable;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public interface HwFromStudentRepository extends JpaRepository<HwFromStudentTable, Long> {

    List<HwFromStudentTable> findHwFromStudentTablesByStudentName_FirstNameContains(String userName);

    List<HwFromStudentTable> findHwFromStudentTablesByStudentNameLastNameContains(String userName);

    List<HwFromStudentTable> findHwFromStudentTablesByLessonNumber(Integer lessson);

    //@Query(value = "select * from hw_from_students inner join tg_user u where u.last_name like %?1%", nativeQuery = true)
    Optional<HwFromStudentTable> findByLastName(String userName);

    List<HwFromStudentTable> findAll();

    //@Query(value = "SELECT * FROM hw_from_students WHERE student_id = ?", nativeQuery = true)
    HwFromStudentTable findHwFromStudentTableByStudentId(Long id);

    @Transactional
    //@Modifying
    //@Query(value = "DELETE FROM hw_from_students WHERE student_id = ?1", nativeQuery = true)
    void deleteById(Long id);

}
