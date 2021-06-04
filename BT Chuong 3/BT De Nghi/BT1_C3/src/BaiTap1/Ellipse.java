package BaiTap1;

public class Ellipse {
	public static final double PI = 3.14;
	private double bkTrucLon, bkTrucNho;
	public Ellipse() {}
	public Ellipse(double bkLon, double bkNho) {
		this.bkTrucLon = bkLon;
		this.bkTrucNho = bkNho;
	}
	public double tinhDienTich() {
		return PI * this.bkTrucLon * this.bkTrucNho;
	}
	public double tinhChuVi() {
		return 2 * PI * Math.sqrt((Math.pow(bkTrucLon, 2) + (Math.pow(bkTrucNho, 2)) / 2));
	}
	public String toString() {
		return "Hinh Ellipse\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
	}

	public double getBkTrucLon() {
		return bkTrucLon;
	}

	public void setBkTrucLon(double bkTrucLon) {
		this.bkTrucLon = bkTrucLon;
	}

	public double getBkTrucNho() {
		return bkTrucNho;
	}

	public void setBkTrucNho(double bkTrucNho) {
		this.bkTrucNho = bkTrucNho;
	}
	

}
