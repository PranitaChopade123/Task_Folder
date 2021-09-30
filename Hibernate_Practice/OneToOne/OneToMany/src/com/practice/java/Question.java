package com.practice.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Question")
public class Question {
	@Id
	@Column(name="Question_ID")
	private String Question_ID;
	
	@Column(name="Questions")
	private String Questions;
	
	@OneToMany
	@JoinTable( name="Question_Answer",joinColumns=@JoinColumn(name="Question_ID"),
    inverseJoinColumns=@JoinColumn(name="Answer_ID"))
	private List<Answer> answer =new ArrayList<Answer>();

	
	

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(ArrayList<Answer> answer) {
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
