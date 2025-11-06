package com.zaext.aiqabackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionResp {
    private Long id;
    private String title;
    private String content;
}
