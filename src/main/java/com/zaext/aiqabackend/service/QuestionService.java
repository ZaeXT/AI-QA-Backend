package com.zaext.aiqabackend.service;

import com.zaext.aiqabackend.dto.QuestionCreateReq;
import com.zaext.aiqabackend.dto.QuestionResp;
import com.zaext.aiqabackend.entity.Question;
import com.zaext.aiqabackend.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<QuestionResp> getAll() {
        return questionRepository.findAll()
                .stream()
                .map(q -> new QuestionResp(q.getId(),q.getTitle(),q.getContent()))
                .toList();
    }

    public QuestionResp create(QuestionCreateReq req) {
        Question q = Question.builder()
                .id(null)
                .title(req.getTitle())
                .content(req.getContent())
                .build();
        Question saved = questionRepository.save(q);
        return new QuestionResp(saved.getId(), saved.getTitle(), saved.getContent());
    }

    public void delete(Long id) {
        questionRepository.deleteById(id);
    }
}
