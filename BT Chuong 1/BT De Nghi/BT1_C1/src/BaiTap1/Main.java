package BaiTap1;
import java.util.*;

//Sinh ngau nhien mot so tu nhien tu 1 den 100

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (int)(Math.random() * 100) + 1;
		int predict;
		do {
			System.out.println("Nhap so ban doan: ");
			predict = sc.nextInt();
			if(predict > n)
				System.out.println("So ban doan lon hon!");
			else
				if(predict < n)
					System.out.println("So ban doan nho hon!");
				else
					System.out.println("Ban doan chinh xac!!!");
		}while(predict != n);
		
	}


}
