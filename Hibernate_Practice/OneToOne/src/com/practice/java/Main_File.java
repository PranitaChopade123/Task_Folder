
package com.practice.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question que1=new Question();
		Answer ans1 =new Answer();
		
		Question que2=new Question();
		Answer ans2 =new Answer();
		
		Question que3=new Question();
		Answer ans3 =new Answer();
		
		
		que1.setQuestions("What is Java ?");
		que1.setQuestion_ID("1");
		
		que2.setQuestions("What is CSS ?");
		que2.setQuestion_ID("2");
		
		que3.setQuestions("What is HTML ?");
		que3.setQuestion_ID("3");
		
		
		ans1.setAnswer_ID("102");
		ans1.setAnswer_Of_Question("It is a programming language");
	
		ans2.setAnswer_ID("103");
		ans2.setAnswer_Of_Question("It is a Cascading Style Sheet");
		
		ans3.setAnswer_ID("101");
		ans3.setAnswer_Of_Question("It is a Hyper Text Markup Language");
		
		 que1.setAnswer(ans1);
		 que2.setAnswer(ans2);
		 que3.setAnswer(ans3);
		 
		
		
		
		SessionFactory sf = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory(); 
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(que1);
		s.save(ans1);
		s.save(que2);
		s.save(ans2);
		s.save(que3);
		s.save(ans3);
		s.getTransaction().commit();
		s.close();
		
		
		
	}

}
