package com.practice.java;

import javax.persistence.*;

@Entity
@Table(name="Answer")
public class Answer {
 
	@Id
	@Column(name="Answer_ID")
	private String Answer_ID;
	
	@Column(name="Answer_Of_Question")
	private String Answer_Of_Question;

	public String getAnswer_ID() {
		return Answer_ID;
	}

	public void setAnswer_ID(String answer_ID) {
		Answer_ID = answer_ID;
	}

	public String getAnswer_Of_Question() {
		return Answer_Of_Question;
	}

	public void setAnswer_Of_Question(String answer_Of_Question) {
		Answer_Of_Question = answer_Of_Question;
	}
	
	
	
}
