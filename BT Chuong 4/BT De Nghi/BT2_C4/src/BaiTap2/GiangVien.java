package BaiTap2;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GiangVien implements Comparable<GiangVien> {
	private String hoTen, hocHam, hocVi;
	private Date ngaySinh, ngayBatDau;
	private double tienLuong = 0;
	public GiangVien(String ht, Date ns, String hh, String hv, Date ngayBd) {
		this.hoTen = ht;
		this.ngaySinh = ns;
		this.hocHam = hh;
		this.hocVi = hv;
		this.ngayBatDau = ngayBd;
	}
	public GiangVien() {}
	public abstract double tinhTienLuong(float soGio);
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String s = "\nHo ten: " + this.hoTen + "\nNgay sinh: " + f.format(ngaySinh) + "\nHoc ham: " + this.hocHam + "\nHoc vi: " + this.hocVi + "\nNgay bat dau: " + f.format(ngayBatDau);
		if(this.tienLuong > 0)
			s += String.format("\nTien luong: %,.2f", this.tienLuong);
		return s;
	}
	
	
	@Override
	public int compareTo(GiangVien o) {
		return this.tienLuong > o.tienLuong ? -1 : (this.tienLuong < o.tienLuong ? 1 : 0);
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getHocHam() {
		return hocHam;
	}
	public void setHocHam(String hocHam) {
		this.hocHam = hocHam;
	}
	public String getHocVi() {
		return hocVi;
	}
	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public double getTienLuong() {
		return tienLuong;
	}
	public void setTienLuong(double tienLuong) {
		this.tienLuong = tienLuong;
	}
	
	

}
