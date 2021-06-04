package BaiTap2;

import java.util.Scanner;

public class NhanVien {
	private static final double LUONG_CB = 100000;
	private static int dem = 0;
	private int maSo = ++dem;
	private String cmnd, hoTen, queQuan, gioiTinh, dienThoai;
	protected double tienLuong;
	protected double heSo = 1.0;
	
	public NhanVien(String cmnd, String hoTen, String queQuan, String gioiTinh, String dienThoai) {
		this.cmnd = cmnd;
		this.hoTen = hoTen;
		this.queQuan = queQuan;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
	}
	public NhanVien() {}
	public double tinhLuong(int soNgayLam) {
		this.tienLuong = this.heSo * soNgayLam * LUONG_CB;
		return this.tienLuong;
	}
	public void nhapNhanVien(Scanner scanner) {
		scanner.nextLine();
		System.out.println("So CMND: ");
		this.cmnd = scanner.nextLine();
		System.out.println("Ho va ten: ");
		this.hoTen = scanner.nextLine();
		System.out.println("Que quan: ");
		this.queQuan = scanner.nextLine();
		System.out.println("Gioi tinh: ");
		this.gioiTinh = scanner.nextLine();
		System.out.println("So dien thoai: ");
		this.dienThoai = scanner.nextLine();
	}
	public String toString() {
		return "\nMa nhan vien: " + this.maSo + "\nSo CMND: " + this.cmnd + "\nHo va ten: " + this.hoTen + "\nQue quan: " + this.queQuan + "\nGioi tinh: " + this.gioiTinh + "\nSo dien thoai: " + this.dienThoai + "\nTien luong: " + this.tienLuong;
	}
	
	public double getTienLuong() {
		return tienLuong;
	}
	public int getMaSo() {
		return maSo;
	}
	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	
}
