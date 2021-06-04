package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanPham {
	private String maSP, tenSP, moTa;
	private Date ngaySanXuat;
	private double giaBan;
	public SanPham() {}
	public SanPham(String ma, String ten, String mota, Date ngaysx, double gia) {
		this.maSP = ma;
		this.tenSP = ten;
		this.moTa = mota;
		this.ngaySanXuat = ngaysx;
		this.giaBan = gia;
	}
	public void nhap(Scanner scanner) {
		scanner.nextLine();
		System.out.println("Ma san pham: ");
		this.maSP = scanner.nextLine();
		System.out.println("Ten san pham: ");
		this.tenSP = scanner.nextLine();
		System.out.println("Mo ta san pham: ");
		this.moTa = scanner.nextLine();
		System.out.println("Ngay san xuat san pham: ");
		String ngaySX = scanner.nextLine();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngaySanXuat = f.parse(ngaySX);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Gia san pham: ");
		this.giaBan = scanner.nextDouble();
	}
	public void xuat() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		System.out.printf("Ma san pham: %s\nTen san pham: %s\nMo ta: %s\nNgay san xuat: %s\nGia san pham: %s\n", this.maSP, this.tenSP, this.moTa, f.format(ngaySanXuat), this.giaBan);
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	

}
