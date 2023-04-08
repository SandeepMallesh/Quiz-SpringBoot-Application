package com.org.projectQuiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.projectQuiz.model.Question;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{
	List<Question> findByQidIn(List<Integer> qids);
	
	List<QuestionNumber> findQidBySubjectAndTopic(String subject, String topic);
	
	long countByQidAndAnswer(int qid, int option);

}
