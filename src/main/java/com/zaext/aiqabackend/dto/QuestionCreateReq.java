package com.zaext.aiqabackend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class QuestionCreateReq {
    @NotBlank
    private String title;
    private String content;
}
