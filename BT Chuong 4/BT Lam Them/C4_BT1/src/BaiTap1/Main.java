package BaiTap1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		InCompleteQuestion q0 = new InCompleteQuestion("This is ..(1).. book. I ..(2).. it so much.");
		
		MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("(1)");
		Choice c1 = new Choice("a", true);
		Choice c2 = new Choice("an", false);
		Choice c3 = new Choice("the", false);
		Choice c4 = new Choice("it", false);
		
		q1.addChoice(c1);
		q1.addChoice(c2);
		q1.addChoice(c3);
		q1.addChoice(c4);
		
		q1.shuffleChoice();
		
		MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("(2)");
		Choice c5= new Choice("love", true);
		Choice c6 = new Choice("loves", false);
		Choice c7 = new Choice("lovely", false);
		Choice c8 = new Choice("None of them", false);
		
		q2.addChoice(c5);
		q2.addChoice(c6);
		q2.addChoice(c7);
		q2.addChoice(c8);
		
		q2.shuffleChoice();
		
		q0.addQuestion(q1);
		q0.addQuestion(q2);
		
		QuestionList ql = new QuestionList();
		ql.addQuestion(q0);
		
		Scanner scanner = new Scanner(System.in);
		try {
			ql.praticeInCompleteQuestion(scanner);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		try {
//			ql.praticeMultipleChoice(scanner, 2);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		q0.addQuestion(q1);
		q0.addQuestion(q2);
		
//		System.out.println(q0);
//		Scanner scanner = new Scanner(System.in);
//		for(MultipleChoiceQuestion q: q0.getQuestions()) {
//			System.out.printf("Tra loi cho cau %s:\n", q.getContent());
//			String ans = scanner.next();
//			if(q.checkAnswer(ans) == true)
//				System.out.println("CORRECT!!!");
//			else
//				System.out.println("INCORRECT!!!");
//		}
//			
		
//		System.out.println(q1);
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Tra loi: ");
//		String ans = scanner.next();
//		if(q1.checkAnswer(ans) == true)
//			System.out.println("CORRECT!!!");
//		else
//			System.out.println("INCORRECT!!!");
		

	}

}
