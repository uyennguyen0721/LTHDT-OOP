package KTTH;

public class SINHVIEN {
	private String maSo, hoLot, ten, queQuan, nganhHoc;
	private int ngaySinh, thangSinh, namSinh;
	public SINHVIEN(){}
	public SINHVIEN(String maSo, String hoLot, String ten, String queQuan, String nganhHoc, int ngayS, int thangS, int namS){
		this.maSo = maSo;
		this.hoLot = hoLot;
		this.ten = ten;
		this.queQuan = queQuan;
		this.nganhHoc = nganhHoc;
		this.ngaySinh = ngayS;
		this.thangSinh = thangS;
		this.namSinh = namS;
	}
	public String toString(){
		return "\nMa so: " + this.maSo + "\nHo va ten: " + this.hoLot + " " + this.ten + "\nQue quan: " + this.queQuan + "\nNganh hoc: " + this.nganhHoc + "\nNgay sinh: " + this.ngaySinh + "-" + this.thangSinh + "-" + this.namSinh;
		
	}
	public void ShowMenu() {
		System.out.println("----- MENU -----"
				+ "\n1. In ra thong tin sinh vien thu k trong danh sach."
				+ "\n2. In ra thong tin tat ca sinh vien ma que quan thuoc tinh thanh NSD nhap vao."
				+ "\n3. In danh sach sinh vien theo thu tu ten tang dan(hoac giam dan)."
				+ "\n4. In danh sach sinh vien theo thu tu ho lot giam dan(hoac tang dan)."
				+ "\n5. In ra danh sach sinh vien theo thu tu ngay sinh(theo nam/thang/ngay)."
				+ "\n6. In ra cac sinh vien co khuon dang ten vua nhap."
				+ "\n7. In ra cac sinh vien co ma so ma cac ki tu cuoi trung voi khuon dang vua nhap."
				+ "\n8. Ket thuc chuong trinh.\n");
	}
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoLot() {
		return hoLot;
	}
	public void setHoLot(String hoLot) {
		this.hoLot = hoLot;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getNganhHoc() {
		return nganhHoc;
	}
	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getThangSinh() {
		return thangSinh;
	}
	public void setThangSinh(int thangSinh) {
		this.thangSinh = thangSinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	

}
