package BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class InCompleteQuestion extends Question {
	private List<MultipleChoiceQuestion> questions;

	public InCompleteQuestion(String content) {
		super(content);
		this.questions = new ArrayList<>();
	}
	public void addQuestion(MultipleChoiceQuestion q) {
		this.questions.add(q);
	}
	

	@Override
	public String toString() {
		String s = super.toString();
		for(MultipleChoiceQuestion q: this.questions)
			s += q;
		return s;
	}
	public List<MultipleChoiceQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<MultipleChoiceQuestion> questions) {
		this.questions = questions;
	}

}
