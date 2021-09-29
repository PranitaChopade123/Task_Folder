package com.practice.java;

import javax.persistence.*;


@Entity
@Table(name="Question")
public class Question {
	@Id
	@Column(name="Question_ID")
	private String Question_ID;
	
	@Column(name="Questions")
	private String Questions;
	
	@OneToOne
	private Answer answer;

	
	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public String getQuestion_ID() {
		return Question_ID;
	}

	public void setQuestion_ID(String question_ID) {
		Question_ID = question_ID;
	}

	public String getQuestions() {
		return Questions;
	}

	public void setQuestions(String questions) {
		Questions = questions;
	}

	
	
}
