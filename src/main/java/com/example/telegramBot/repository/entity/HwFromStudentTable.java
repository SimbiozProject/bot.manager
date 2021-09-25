package com.example.telegramBot.repository.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
//@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
//Table(name = "hw_from_students")
public class HwFromStudentTable implements Serializable {
    //@Id
    //GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "student_id")
    private Long studentId;

//    //@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    //@JoinColumn(name = "student_name")
    private TgUserTable studentName;

    // @Column(name = "lesson_number")
    private int lessonNumber;

    // @Column(name = "students_hw")
    private String hwFromStudent;

}
