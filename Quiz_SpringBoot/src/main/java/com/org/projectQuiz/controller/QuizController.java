package com.org.projectQuiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.projectQuiz.model.Question;
import com.org.projectQuiz.repository.QuestionRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QuizController {
	@Autowired
	private QuestionRepository repo;


	public ResponseEntity<Question> add(@RequestBody Question question){
		question = repo.save(question);
		return ResponseEntity.status(HttpStatus.CREATED).body(question);
	}

	public ResponseEntity<List<Question>> generate(@RequestParam("subject") String subject, @RequestParam("topic") String topic){
		List<Integer> ids = repo.findQidBySubjectAndTopic(subject, topic).stream().map(qn->qn.getQid()).collect(Collectors.toList());
		Collections.shuffle(ids);
		List<Question> questions=repo.findByQidIn(ids.subList(0,10));
		return ResponseEntity.status(HttpStatus.OK).body(questions);
	}
}
