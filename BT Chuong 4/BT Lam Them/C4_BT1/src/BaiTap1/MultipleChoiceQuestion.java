package BaiTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
	private static final String[] LABELS = {"A", "B", "C", "D"};
	private List<Choice> choices;

	public MultipleChoiceQuestion(String content) {
		super(content);
		this.choices = new ArrayList<>();
	}
	public void addChoice(Choice c) {
		if(this.choices.size() < LABELS.length)
			this.choices.add(c);
	}
	public boolean checkAnswer(String ans) {
		for(int i = 0; i < this.choices.size(); i++)
			if(this.choices.get(i).isCorrect() == true && LABELS[i].equals(ans.toUpperCase()) == true)
				return true;
		return false;
	}
	//Phuong thuc xao tron cau tra loi
	public void shuffleChoice() {
		Collections.shuffle(choices);
		
	}
	

	@Override
	public String toString() {
		String s = super.toString();
		for(int i = 0; i < this.choices.size(); i++)
			s += String.format("%s. %s\n", LABELS[i], this.choices.get(i));
		return s;
	}
	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

}
