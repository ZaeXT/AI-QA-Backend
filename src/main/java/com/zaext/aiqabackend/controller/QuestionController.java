package com.zaext.aiqabackend.controller;

import com.zaext.aiqabackend.dto.QuestionCreateReq;
import com.zaext.aiqabackend.dto.QuestionResp;
import com.zaext.aiqabackend.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping
    public List<QuestionResp> getAll() {
        return questionService.getAll();
    }

    @PostMapping
    public QuestionResp create(@RequestBody QuestionCreateReq q) {
        return questionService.create(q);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        questionService.delete(id);
    }
}
