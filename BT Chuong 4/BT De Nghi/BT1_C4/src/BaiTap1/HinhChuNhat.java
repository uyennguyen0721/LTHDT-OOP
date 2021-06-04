package BaiTap1;

public class HinhChuNhat extends Hinh {
	private double chieuDai, chieuRong;

	
	public HinhChuNhat(double dai, double rong) {
		super.setTen("Hinh Chu Nhat");
		// TODO Auto-generated constructor stub
		this.chieuDai = dai;
		this.chieuRong = rong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuDai * this.chieuRong;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * (this.chieuDai + this.chieuRong);
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	

}
