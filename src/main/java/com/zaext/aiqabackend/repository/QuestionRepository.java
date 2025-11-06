package com.zaext.aiqabackend.repository;

import com.zaext.aiqabackend.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}