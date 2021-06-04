package KTTH;

public class CONGDAN {
	private String hoTen, cmnd;
	private long namSinh;
	public CONGDAN(){}
	public CONGDAN(String hoten, String cm, long ns){
		hoTen = hoten;
		cmnd = cm;
		namSinh =ns;
	}
	public String toString(){
		return "\nHo ten: " + hoTen + "\nNam sinh: " + namSinh + "\nSo CMND: " + cmnd;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public long getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(long namSinh) {
		this.namSinh = namSinh;
	}

}
