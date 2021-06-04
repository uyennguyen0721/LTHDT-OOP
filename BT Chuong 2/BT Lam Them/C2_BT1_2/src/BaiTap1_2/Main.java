package BaiTap1_2;

public class Main {
	public static void main(String[] args) {
		PhanSo p1 = new PhanSo(2, 3), p2 = new PhanSo(3, 4), p3 = new PhanSo(4, 5), p4 = new PhanSo(5, 6), p5 = new PhanSo(2, 5);
		DsPhanSo ds = new DsPhanSo();
		ds.themPhanSo(p3); ds.themPhanSo(p1); ds.themPhanSo(p4); ds.themPhanSo(p3); ds.themPhanSo(p5);
		System.out.println("----- XUAT DANH SACH PHAN SO -----");
		ds.hienThi();
		System.out.println("----- THEM PHAN SO -----");
		ds.themPhanSo(p2);
		ds.hienThi();
		System.out.println("----- XOA PHAN SO -----");
		ds.xoaPhanSo(p3);
		ds.hienThi();
		System.out.println("----- TONG DANH SACH PHAN SO -----\n"
				+ "Tong danh sach = ");
		ds.tinhTong().hienThi();
		System.out.println("----- SAP XEP -----");
		ds.sapXep();
		ds.hienThi();
		
	}
	

}
