package KTTH;

public class GIANGVIEN extends CONGDAN {
	private static int dem = 0;
	private int maGV = ++dem;
	private String khoa, hocVi, hocHam, soDienThoai;
	public GIANGVIEN(){
		super();
	}
	public GIANGVIEN(String ht, String cm, long ns, String k, String hv, String hh, String sdt){
		super(ht, cm, ns);
		khoa = k;
		hocVi = hv;
		hocHam = hh;
		soDienThoai = sdt;
		
	}
	
	public String toString() {
		return super.toString() + "\nMa giang vien: " + maGV + "\nKhoa: " + khoa + "\nHoc vi: " + hocVi + "\nHoc ham: " + hocHam + "\nSo dien thoai: " + soDienThoai;
	}
	
	public int getMaGV() {
		return maGV;
	}
	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getHocVi() {
		return hocVi;
	}
	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}
	public String getHocHam() {
		return hocHam;
	}
	public void setHocHam(String hocHam) {
		this.hocHam = hocHam;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}
