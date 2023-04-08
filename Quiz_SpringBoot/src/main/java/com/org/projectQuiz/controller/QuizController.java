package com.org.projectQuiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.projectQuiz.model.Question;
import com.org.projectQuiz.repository.QuestionRepository;

public class QuizController {
	@Autowired
	private QuestionRepository repo;
	
	
	public ResponseEntity<Question> add(@RequestBody Question question){
		question = repo.save(question);
		return ResponseEntity.status(HttpStatus.CREATED).body(question);
	}
}
