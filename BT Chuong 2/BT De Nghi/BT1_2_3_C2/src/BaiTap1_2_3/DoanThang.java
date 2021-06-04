package BaiTap1_2_3;

public class DoanThang {
	private Diem diemDau;
	private Diem diemCuoi;
	public DoanThang(Diem dau, Diem cuoi) {diemDau = dau; diemCuoi = cuoi;}
	public Diem getDiemDau() {return diemDau;}
	public Diem getDiemCuoi() {return diemCuoi;}
	public void setDiemDau(Diem v) {diemDau = v;}
	public void setDiemCuoi(Diem v) {diemCuoi = v;}
	public String toString() {
		return "Doan thang co diem dau va diem cuoi [(" + diemDau.getX() + ", " + diemDau.getY() + "), (" + diemCuoi.getX() + ", " + diemCuoi.getY() + ")]";
	}
	public double tinhDoDai() {
		return diemDau.Dist(diemCuoi);
	}
	public Diem timTrungDiem() {
		return new Diem((this.diemDau.getX() + this.diemCuoi.getX()) / 2, (this.diemDau.getY() + this.diemCuoi.getY()) / 2);
	}
	public boolean ktSongSong(DoanThang d) {
		if((this.diemDau.getX() - this.diemCuoi.getX()) / (this.diemDau.getY() - this.diemCuoi.getY()) == (d.diemDau.getX() - d.diemCuoi.getX()) / (d.diemDau.getY() - d.diemCuoi.getY()))
			return true;
		else
			return false;
	}
	

}
