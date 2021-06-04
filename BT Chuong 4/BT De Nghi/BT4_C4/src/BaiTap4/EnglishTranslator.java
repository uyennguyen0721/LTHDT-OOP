package BaiTap4;

public class EnglishTranslator implements NumberTranslator {

	@Override
	public String getString(int number) {
		String s = null;
		switch(number) {
		case 0:
			s = "Zero";
			break;
		case 1:
			s = "One";
			break;
		case 2:
			s = "Two";
			break;
		case 3:
			s = "Three";
			break;
		case 4:
			s = "Four";
			break;
		case 5:
			s = "Five";
			break;
		case 6:
			s = "Six";
			break;
		case 7:
			s = "Seven";
			break;
		case 8:
			s = "Eight";
			break;
		case 9:
			s = "Nine";
			break;
		}
		return s;
	}

	@Override
	public int getNumber(String str) {
		str = str.toLowerCase();
		int n = -1;
		switch(str) {
		case "zero":
			n = 0;
			break;
		case "one":
			n = 1;
			break;
		case "two":
			n = 2;
			break;
		case "three":
			n = 3;
			break;
		case "four":
			n = 4;
			break;
		case "five":
			n = 5;
			break;
		case "six":
			n = 6;
			break;
		case "seven":
			n = 7;
			break;
		case "eight":
			n = 8;
			break;
		case "nine":
			n = 9;
			break;
		}
		return n;
	}

}
