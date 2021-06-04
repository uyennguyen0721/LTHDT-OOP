package BaiTap2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		//Thu nghiem nen chuoi
		System.out.println("Nhap chuoi s: ");
		s = sc.nextLine();
		Chuoi.NenChuoi(s);
		
		//Thu nghiem giai nen chuoi
		System.out.println("Nhap chuoi s: ");
		s = sc.nextLine();
		Chuoi.GiaiNen(s);
		
	}

}
