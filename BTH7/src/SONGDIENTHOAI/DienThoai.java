package SONGDIENTHOAI;
import java.util.*;

public class DienThoai extends Diem {
	public String SoDienThoai, MaTram;
	public boolean TrangThai;
	public DienThoai() {
		super(); SoDienThoai =  MaTram = null; TrangThai = false; 
	}
	public DienThoai(boolean tt, double x, double y, String sdt, ArrayList<TramPhatSong> dsTram) {
		super(x, y); this.TrangThai = tt; this.SoDienThoai = sdt; this.MaTram = this.TimTram(dsTram);
	}
	public String toString() {
		return "\n-------\na. Trang thai hoat dong: " + (TrangThai == true ? "ON" : "OFF")  + "\nb. Vi tri: (" + X + ", " + Y + ")\nc. So thue bao: " + SoDienThoai + "\nd. Ma tram phat song hien dang phuc vu: " + MaTram + "\n";
	}
	public DienThoai(DienThoai d) {
		super(d.X, d.Y); this.TrangThai = d.TrangThai; this.SoDienThoai = d.SoDienThoai; this.MaTram = d.MaTram;
	}
	public void BatDienThoai() {
		this.TrangThai = true;
	}
	public boolean CoThePhucVu(TramPhatSong Tram) {
		Diem p = new Diem(Tram.x, Tram.y);
		if(this.Dist(p) <= Tram.R) 
			return true;
		return false;
	}
	public String TimTram(ArrayList<TramPhatSong> ds) {
		for(int i = 0; i < ds.size(); i++) {
			if(this.CoThePhucVu(ds.get(i)) && ds.get(i).danhsach.size() < ds.get(i).SoLuongKetNoiMax){
				ds.get(i).danhsach.add(this);
				this.MaTram = ds.get(i).MaTram;
			}
		}
		return this.MaTram;
	}
}