/**
 * 
 */
package com.org.projectQuiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Question {
	@Id
	@GeneratedValue
	private int qid;
	private String description;
	private String optionOne;
	private String optionTwo;
	private String optionThree;
	private String optionFour;
	private int answer;
	private String subject;
	private String topic;
	
	//constructor
	public Question() {
		System.out.println("Welcome to the Quiz portal");
	}
	
	
	public int getQid() {
		return qid;
	}
	public String getDescription() {
		return description;
	}
	public String getOptionOne() {
		return optionOne;
	}
	public String getOptionTwo() {
		return optionTwo;
	}
	public String getOptionThree() {
		return optionThree;
	}
	public String getOptionFour() {
		return optionFour;
	}
	public int getAnswer() {
		return answer;
	}
	public String getSubject() {
		return subject;
	}
	public String getTopic() {
		return topic;
	}

}
