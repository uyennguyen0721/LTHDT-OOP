package BaiTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuestionList {
	private List<Question> questions;
	public QuestionList() {
		this.questions = new ArrayList<>();
	}
	public void addQuestion(Question q) {
		this.questions.add(q);
	}
	private List<Question> getMultipleChoiceQuestion() {
		List<Question> q = new ArrayList<>();
		for(Question p: this.questions) {
			if(p instanceof MultipleChoiceQuestion)
				q.add(p);
		}
		return q;
	}
    private List<Question> getQuestionByClassName(String className) throws ClassNotFoundException {
		Class c = Class.forName(className);
		List<Question> q = new ArrayList<>();
		for(Question p: this.questions) {
			if(c.isInstance(p))
				q.add(p);
		}
		return q;
	}
	
	public void praticeMultipleChoice(Scanner scanner, int number) throws ClassNotFoundException {
		List<Question> q = this.getQuestionByClassName("BaiTap1.MultipleChoiceQuestion");
		Collections.shuffle(q);
		int n = q.size() > number ? number : q.size();
		for(int i = 0; i < n; i++) {
			MultipleChoiceQuestion k = (MultipleChoiceQuestion) q.get(i);
			System.out.println(k);
			System.out.print("Tra loi: ");
			String ans = scanner.next();
			if(k.checkAnswer(ans) == true)
				System.out.println("CORRECT!!!");
			else
				System.out.println("INCORRECT!!!");
		}	
	}
	public void praticeInCompleteQuestion(Scanner scanner) throws ClassNotFoundException {
		List<Question> q = this.getQuestionByClassName("BaiTap1.InCompleteQuestion");
		Collections.shuffle(q);
		if(q.size() > 0) {
			InCompleteQuestion k = (InCompleteQuestion) q.get(0);
			System.out.println(k);
			for(MultipleChoiceQuestion m: k.getQuestions()) {
				System.out.printf("Tra loi cho cau %s:\n", m.getContent());
				String ans = scanner.next();
 		 	    if(m.checkAnswer(ans) == true)
					System.out.println("CORRECT!!!");
				else
					System.out.println("INCORRECT!!!");
			}
		}
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
