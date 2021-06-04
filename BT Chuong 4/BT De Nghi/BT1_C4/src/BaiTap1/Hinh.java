package BaiTap1;

public abstract class Hinh {
	private String ten;
	public Hinh(String ten) {
		this.setTen(ten);
	}
	public Hinh() {}
	public abstract double tinhDienTich();
	public abstract double tinhChuVi();
	public String toString() {
		return this.ten + "\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi(); 
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

}
