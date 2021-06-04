package BaiTap2;

import java.util.Scanner;

public class NhanVienD extends NhanVien {
	private double phuCap;
	public NhanVienD(String cmnd, String hoTen, String queQuan, String gioiTinh, String dienThoai, double phuCap) {
		super(cmnd, hoTen, queQuan, gioiTinh, dienThoai);
		this.phuCap = phuCap;
	}
	public NhanVienD() {
		super();
	}
	
	@Override
	public double tinhLuong(int soNgayLam) {
		// TODO Auto-generated method stub
		this.tienLuong = super.tinhLuong(soNgayLam) + this.phuCap;
		return this.tienLuong;
	}
	

	@Override
	public void nhapNhanVien(Scanner scanner) {
		// TODO Auto-generated method stub
		super.nhapNhanVien(scanner);
		System.out.println("Phu cap: ");
		this.phuCap = scanner.nextDouble();
	}
	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
	
	

}
