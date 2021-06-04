package KTTH;

public class SINHVIEN extends CONGDAN {
	private static int dem = 0;
	private int maSV = ++dem;
	private int namHoc;
	private String khoa, soDienThoai;
	public SINHVIEN(){
		super();
	}
	public SINHVIEN(String ht, String cm, long ns, int nh, String k, String sdt){
		super(ht, cm, ns);
		namHoc = nh;
		khoa = k;
		soDienThoai = sdt;
	}
	
	public String toString() {
		return super.toString() + "\nMa sinh vien: " + maSV + "\nNam hoc: " + namHoc + "\nKhoa: " + khoa + "\nSo dien thoai: " + soDienThoai;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public int getNamHoc() {
		return namHoc;
	}
	public void setNamHoc(int namHoc) {
		this.namHoc = namHoc;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}
