package BaiTap4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		HocVien h1 = new HocVien("Nguyen Van A", "TP.HCM", f.parse("12/04/1998"));
		HocVien h2 = new HocVien("Tran Thi B", "Binh Duong", f.parse("09/12/1996"));
		HocVien h3 = new HocVien("Vo HCM", "Dong Nai", f.parse("11/11/1999"));
		QuanLyHocVien ql = new QuanLyHocVien();
		ql.themHocVien(h1);
		ql.themHocVien(h2);
//		ql.themHocVien(h3);
		Scanner scanner = new Scanner(System.in);
		ql.themHocVien(scanner);
		ql.hienThiDs();
		System.out.println("----- TIM THEO MA HV -----");
		HocVien k = ql.timKiem(2);
		k.hienThi();
		System.out.println("----- TIM THEO TU KHOA -----");
		ArrayList<HocVien> k2 = ql.timKiem("hcm");
		k2.forEach((HocVien h) -> h.hienThi());
		System.out.println("----- NHAP DIEM -----");
		Scanner sc = new Scanner(System.in);
		ql.nhapDiemDs(sc);
		ql.sapXep();
		ql.hienThiDs();
		
//		System.out.println("----- NHAP DIEM -----");
//		sc = new Scanner(System.in);
//		ql.nhapDiemDs(sc);
//		ql.hienThiDs();
		
		System.out.println("----- DS HOC BONG -----");
		ArrayList<HocVien> hb = ql.xetHocBong();
		hb.forEach((HocVien h) -> h.hienThi());
	}

}
