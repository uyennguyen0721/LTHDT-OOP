package BaiTap2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		try {
			GiangVien gv1 = new GvCoHuu("Nguyen Van A", f.parse("01/01/1980"), "", "TS", f.parse("02/01/2018"), 1500000, 2);
			GiangVien gv2 = new GvThinhGiang("Tran Thi B", f.parse("02/03/1986"), "PGS", "TS", f.parse("02/05/2017"), "Tap doan FPT");
			GiangVien gv3 = new GvThinhGiang("Nguyen Van C", f.parse("20/5/1987"), "", "Thac si", f.parse("18/9/2018"), "Cong ty Phan Mem Duc Tri");
			QLGiangVien ql = new QLGiangVien();
			
			//Them giang vien
			System.out.println("\n----- DS GIANG VIEN SAU KHI THEM -----\n");
			ql.themGv(gv1);
			ql.themGv(gv2);
			ql.themGv(gv3);
			System.out.println(ql);
			
			//Xoa giang vien
			System.out.println("\n----- DS GIANG VIEN SAU KHI XOA -----\n");
			ql.xoaGv(gv3);
			System.out.println(ql);
			
			//Tra cuu thong tin giang vien
			System.out.println("\n----- TRA CUU THONG TIN GIANG VIEN -----\n");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap tu khoa: ");
			String kw = scanner.nextLine();
			QLGiangVien k = ql.traCuu(kw);
			System.out.println(k);
			
			//Tinh tien luong giang vien
			System.out.println("\n----- TINH LUONG GIANG VIEN -----\n");
			ql.tinhTienLuong(scanner);
			
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}

	}

}
