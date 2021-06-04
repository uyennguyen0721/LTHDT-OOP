package BaiTap2;

public class HinhChuNhat {
	private double chieuDai, chieuRong;
	public HinhChuNhat(double dai, double rong) {
		this.chieuDai = dai;
		this.chieuRong = rong;
	}
	public double tinhDienTich() {
		return this.chieuDai * this.chieuRong;
	}
	public double tinhChuVi() {
		return 2 * (this.chieuDai + this.chieuRong);
	}
	public String toString() {
		return "Hinh chu nhat\nDien tich: " + this.tinhDienTich() + "\nChu vi: " + this.tinhChuVi(); 
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
