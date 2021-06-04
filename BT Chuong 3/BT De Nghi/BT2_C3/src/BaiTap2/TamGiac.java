package BaiTap2;

public class TamGiac {
	private double a, b, c;
	public TamGiac(double a, double b, double c) {
		if(a + b > c && b + c > a && a + c > b) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else
			System.out.println("Khong phai 3 canh cua tam giac, khong luu tru!");	
	}
	public double tinhDienTich() {
		double p = (this.a + this.b + this.c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	public double tinhChuVi() {
		return this.a + this.b + this.c;
	}
	public String toString() {
		return "Hinh tam giac\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	

}
