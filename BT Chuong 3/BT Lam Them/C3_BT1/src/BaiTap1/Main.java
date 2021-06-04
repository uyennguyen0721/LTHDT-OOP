package BaiTap1;

import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
		QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
		TaiKhoan tk1 = new TaiKhoan("aaa", "aaa@gmail.com", "123", 5000);
		TaiKhoan tk2 = new TaiKhoanCoKyHan("bbb", "bbb@gmail.com", "132", 5500, KyHan.MOT_NAM, new GregorianCalendar(2020,04,24));
		TaiKhoan tk3 = new TaiKhoanCoKyHan("aaa", "aaa@gmail.com", "231", 5550, KyHan.MOT_THANG, new GregorianCalendar(2020,05,25));
		TaiKhoan tk4 = new TaiKhoan("ccc", "ccc@gmail.com", "321", 5555);
		TaiKhoan tk5 = new TaiKhoan("abc", "abc@gmail.com", "213", 5050);
		ql.themtaiKhoan(tk1);
		ql.themtaiKhoan(tk2);
		ql.themtaiKhoan(tk3);
		ql.themtaiKhoan(tk4);
		ql.themtaiKhoan(tk5);
		System.out.println("\n----- XEM THONG TIN TAI KHOAN -----\n");
		ql.hienThi();
		
		System.out.println("\n----- TRA CUU TAI KHOAN THEO SO TAI KHOAN -----\n");
		System.out.println("Thong tin cua so tai khoan '00003' la:\n" + ql.traCuu("00003").toString() + "\n");
		
		System.out.println("\n----- TRA CUU TAI KHOAN THEO TEN TAI KHOAN -----\n");
		System.out.println("Danh sach tai khoan co ten 'aaa' la: ");
		for(int i = 0; i < ql.traCuu1("aaa").size(); i++) {
			System.out.println(ql.traCuu1("aaa").get(i).toString() + "\n");
		}
		
		System.out.println("\n----- TINH TIEN LAI KHI DEN NGAY DAO HAN -----\n");
		for(int i = 0; i < ql.getDsTaiKhoan().size(); i++)
			if(ql.getDsTaiKhoan().get(i).ktDaoHan())
				System.out.println("*So tai khoan " + ql.getDsTaiKhoan().get(i).soTaiKhoan + " co: \n+ Tien lai la " + ql.getDsTaiKhoan().get(i).tinhTienLai() + "\n+ Tien trong tai khoan: " + (ql.getDsTaiKhoan().get(i).soTien + ql.getDsTaiKhoan().get(i).tinhTienLai()));
			else
				System.out.println("*So tai khoan " + ql.getDsTaiKhoan().get(i).soTaiKhoan + " co so tien trong tai khoan: " + ql.getDsTaiKhoan().get(i).soTien);
		
		//Chi test thu thoi nen dung for de nop va rut tien luon cho thuan tien vay @@ san tien kt luon =.=
		System.out.println("\n----- NOP TIEN VAO TAI KHOAN -----\n");
		for(int i = 0; i < ql.getDsTaiKhoan().size(); i++)
			if(ql.getDsTaiKhoan().get(i).ktDaoHan())
				try {
					ql.getDsTaiKhoan().get(i).nopTien(400);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		System.out.println("Cac tai khoan sau khi duoc nop vao so tien '400' la:\n");
		ql.hienThi();
		
		
		System.out.println("\n----- RUT TIEN RA TAI KHOAN -----\n");
		for(int i = 0; i < ql.getDsTaiKhoan().size(); i++)
			if(ql.getDsTaiKhoan().get(i).ktDaoHan())
				try {
					ql.getDsTaiKhoan().get(i).rutTien(400);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		System.out.println("Cac tai khoan sau khi duoc nop vao so tien '400' la:\n");
		ql.hienThi();
		
//		System.out.println("\n----- CAP NHAT DAO HAN DOI VOI TAI KHOAN CO KI HAN -----\n");
//		for(int i = 0; i < ql.getDsTaiKhoan().size(); i++)
//			if()
		//Thoi thi kho qua ta bo qua di =.=
		
	}


}
