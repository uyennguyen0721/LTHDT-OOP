package BaiTap2;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		//Nhap vao ten dia chi email va xuat ra phan ten cua dia chi do
		String email, chuoi;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ten dia chi email: ");
		email = s.nextLine();
		System.out.println("Phan ten cua dia chi do la: " + email.substring(0, email.indexOf("@")));
		
		//Nhap vao mot chuoi va in so luong ki tu hoa co trong chuoi
		System.out.println("Nhap chuoi: ");
		chuoi = s.nextLine();
		int dem = 0;
		for(int i = 0; i < chuoi.length(); i++)
			if(Character.isUpperCase(chuoi.charAt(i)) == true)
				dem++;
		System.out.println("So ky tu hoa = " + dem);
		
		//Doc du lieu tu mot tap tin van ban input.txt, thay the tat ca cac ky hieu {file} thanh chuoi "tap tin" va ghi ket qua vao tap tin output.txt
		File f = new File("src/input.txt");
		File out = new File("src/output.txt");
		try (Scanner scanner = new Scanner(f); PrintWriter writer = new PrintWriter(out)) {
			String st = scanner.nextLine();
			String kq = st.replaceAll("\\{file\\}", "Tập tin");
			writer.println(kq);
		}
		
		//Dem so tu trong xau va tim tu dai nhat
		String str = "This is a java class";
		//trim() cat khoang trang o 2 dau chuoi
		//Bieu thuc chinh quy "\\s" dai dien cho 1 khoang trang, con "\\s+" dai dien cho 1 hay nhieu khoang trang
		String[] KQ = str.trim().split("\\s+"); 
		System.out.println("So tu = " + KQ.length);
		String maxStr = KQ[0];
		for(int i = 1; i < KQ.length; i++)
			if(KQ[i].length() > maxStr.length())
				maxStr = KQ[i];
		System.out.println("Tu dai nhat la: " + maxStr);
	}

}
