package BaiTap4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String s;
		int n;
		VietnameseTranslator v = new VietnameseTranslator();
		EnglishTranslator e = new EnglishTranslator();
		
		//Chuyen so thanh chuoi ENGLISH
		System.out.println("\n=== CHUYEN SO THANH CHUOI ENGLISH ===\n");
		System.out.println("Nhap vao so can chuyen (tu 0 den 9): ");
		n = scanner.nextInt();
		if(e.getString(n) != null)
			System.out.println("So " + n + " sau khi chuyen thanh chuoi English: " + e.getString(n) + "\n");
		else
			System.out.println("So vua nhap khong dung voi yeu cau!");
		
		//Chuyen so thanh chuoi VIETNAMESE
		scanner.nextLine();
		System.out.println("\n=== CHUYEN SO THANH CHUOI VIETNAMESE ===\n");
		System.out.println("Nhap vao so can chuyen (tu 0 den 9): ");
		n = scanner.nextInt();
		if(v.getString(n) != null)
			System.out.println("So " + n + " sau khi chuyen thanh chuoi Vietnamese: " + v.getString(n) + "\n");
		else
			System.out.println("So vua nhap khong dung voi yeu cau!");
		
		//Chuyen chuoi ENGHISH thanh so:
		scanner.nextLine();
		System.out.println("\n=== CHUYEN CHUOI ENGLISH THANH SO ===\n");
		System.out.println("Nhap vao chuoi can chuyen: ");
		s = scanner.nextLine();
		if(e.getNumber(s) != -1)
			System.out.println("Chuoi '" + s + "' sau khi chuyen thanh so: " + e.getNumber(s) + "\n");
		else
			System.out.println("Chuoi vua nhap khong hop le!");
		
		//Chuyen chuoi VIETNAMESE thanh so
		System.out.println("\n=== CHUYEN CHUOI VIETNAMESE THANH SO ===\n");
		System.out.println("Nhap vao chuoi can chuyen: ");
		s = scanner.nextLine();
		if(v.getNumber(s) != -1)
			System.out.println("Chuoi '" + s + "' sau khi chuyen thanh so: " + v.getNumber(s) + "\n");
		else
			System.out.println("Chuoi vua nhap khong hop le!");
		
		
	}

}
