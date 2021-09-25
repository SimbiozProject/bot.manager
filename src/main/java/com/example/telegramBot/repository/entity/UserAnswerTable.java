package com.example.telegramBot.repository.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
//@Entity
@NoArgsConstructor
//Table(name = "user_answer")
public class UserAnswerTable  implements Serializable {

    //@Id
    //GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "user_id")
    private Long id;

//    //@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    //@JoinColumn(name = "user_name")
    private TgUserTable userName;

//    //@ManyToOne(fetch = FetchType.EAGER)
//    //@JoinColumn(name = "question_id", nullable = false)
    private QuestionAnswerTable questionAnswer;

    // @Column(name = "answer")
    private String answer;


}
