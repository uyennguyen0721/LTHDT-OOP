package BaiTap1_2_3;

public class HinhChuNhat {
	private Diem diemTrenTrai;
	private Diem diemDuoiPhai;
	public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
		if(duoiPhai.getX() > trenTrai.getX() && duoiPhai.getY() < trenTrai.getY()) {
			this.diemTrenTrai = trenTrai;
			this.diemDuoiPhai = duoiPhai;
		}
		else
			throw new Exception("Du lieu dau vao khong hop le");
		
	}
	public double tinhDienTich() {
		double chieuDai = this.diemDuoiPhai.getX() - this.diemTrenTrai.getX();
		double chieuRong = this.diemTrenTrai.getY() - this.diemDuoiPhai.getY();
		return chieuDai * chieuRong;
	}
	public double tinhChuVi() {
		double chieuDai = this.diemDuoiPhai.getX() - this.diemTrenTrai.getX();
		double chieuRong = this.diemTrenTrai.getY() - this.diemDuoiPhai.getY();
		return (chieuDai + chieuRong) * 2;
	}
	public String toString() {
		return "Hinh chu nhat co diem tren trai" + diemTrenTrai.toString() + " va diem duoi phai" + diemDuoiPhai.toString() +
				"\nDien tich = " + this.tinhDienTich() + ", Chu vi = " + this.tinhChuVi();
	}
	

}
