package BaiTap1;

public class Ellipse extends Hinh {
	private static final double PI = 3.14;
	private double trucLon, trucNho;
	public Ellipse(double lon, double nho) {
		super.setTen("Ellipse");
		this.trucLon = lon;
		this.trucNho = nho;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return PI * this.trucLon * this.trucNho;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * PI * Math.sqrt((Math.pow(trucLon, 2) + Math.pow(trucNho, 2)) / 2);
	}

	public double getTrucLon() {
		return trucLon;
	}

	public void setTrucLon(double trucLon) {
		this.trucLon = trucLon;
	}

	public double getTrucNho() {
		return trucNho;
	}

	public void setTrucNho(double trucNho) {
		this.trucNho = trucNho;
	}
	

}
