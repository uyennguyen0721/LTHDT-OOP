package BaiTap1;


public class TaiKhoan {
	private static int dem = 0;
	protected String soTaiKhoan, tenTaiKhoan, diaChi, email;
	protected double soTien;
	{
		dem++;
		this.soTaiKhoan = String.format("%06d", dem);
	}
	public TaiKhoan() {}
	public TaiKhoan(String tenTk, String email, String diaChi, double soTien) {
		this.tenTaiKhoan = tenTk;
		this.email = email;
		this.diaChi = diaChi;
		this.soTien = soTien;
	}
	public void rutTien(double soTien) throws Exception {
		if(this.ktDaoHan() == false)
			throw new Exception("Chua den ngay dao han.");
		this.soTien -= soTien;
	}
	public void nopTien(double soTien) throws Exception {
		if(this.ktDaoHan() == false)
			throw new Exception("Chua den ngay dao han.");
		this.soTien += soTien;
	}
	public double tinhTienLai() {
		return this.soTien * 0.001;
		
	}
	public boolean ktDaoHan() {
		return true;
	}
	public String toString() {
		return "So tai khoan: " + this.soTaiKhoan + "\nTen tai khoan: " + this.tenTaiKhoan + "\nEmail: " + this.email + "\nDia chi: " + this.diaChi +  "\nSo tien: " + this.soTien;
	}
	

}
