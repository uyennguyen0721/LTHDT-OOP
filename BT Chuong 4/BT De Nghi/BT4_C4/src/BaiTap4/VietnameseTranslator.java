package BaiTap4;

public class VietnameseTranslator implements NumberTranslator {

	@Override
	public String getString(int number) {
		String s = null;
		switch(number) {
		case 0:
			s = "Khong";
			break;
		case 1:
			s = "Mot";
			break;
		case 2:
			s = "Hai";
			break;
		case 3:
			s = "Ba";
			break;
		case 4:
			s = "Bon";
			break;
		case 5:
			s = "Nam";
			break;
		case 6:
			s = "Sau";
			break;
		case 7:
			s = "Bay";
			break;
		case 8:
			s = "Tam";
			break;
		case 9:
			s = "Chin";
			break;
		}
		return s;
	}

	@Override
	public int getNumber(String str) {
		str = str.toLowerCase();
		int n = -1;
		switch(str) {
		case "khong":
			n = 0;
			break;
		case "mot":
			n = 1;
			break;
		case "hai":
			n = 2;
			break;
		case "ba":
			n = 3;
			break;
		case "bon":
			n = 4;
			break;
		case "nam":
			n = 5;
			break;
		case "sau":
			n = 6;
			break;
		case "bay":
			n = 7;
			break;
		case "tam":
			n = 8;
			break;
		case "chin":
			n = 9;
			break;
		}
		return n;
	}

}
