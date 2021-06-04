package BaiTap2;

public class Chuoi {
	public static void NenChuoi(String s) {
		String st = "";
		int dem = 1;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1))
				dem++;
			if(s.charAt(i) != s.charAt(i - 1)) {
				if(dem > 1)
					st += String.valueOf(dem) + String.valueOf(s.charAt(i - 1));
				else
					st += String.valueOf(s.charAt(i - 1));
				dem = 1;
			}
			if(i == s.length() - 1) {
				if(dem > 1)
					st += String.valueOf(dem) + String.valueOf(s.charAt(i));
				else
					st += String.valueOf(s.charAt(i));
			}
				
		}
		System.out.println("Chuoi " + s + " sau khi nen tro thanh " + st);
	}
	public static void GiaiNen(String s) {
		String st = "";
		int n = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				n = Integer.parseInt(String.valueOf(s.charAt(i)));
				for(int j = 0; j < n - 1; j++)
					st += String.valueOf(s.charAt(i + 1));
			}
			else
				st += String.valueOf(s.charAt(i));
		}
		System.out.println("Chuoi " + s + " sau khi giai nen tro thanh " + st);
	}

}
