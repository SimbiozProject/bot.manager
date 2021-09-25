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
@NoArgsConstructor
//Table(name = "courses")
@ToString(exclude = {"userSet", "groupSet"})
public class CourseTable implements Serializable {

    //@Id
    //GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "course_id")
    private Long courseId;

    // @Column(name = "course_name")
    private String courseName;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "courseUser")
//    private Set<TgUserTable> userSet;
//
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "groupCourse")
//    private Set<GroupTable> groupSet;

}
