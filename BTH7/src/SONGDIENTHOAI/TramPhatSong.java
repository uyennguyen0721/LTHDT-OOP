package SONGDIENTHOAI;
import java.util.*;

public class TramPhatSong extends HinhTron {
	public String MaTram;
	public double DoManh;
	public long SoLuongKetNoiMax;
	public ArrayList<DienThoai> danhsach;
	public TramPhatSong(){ super(); MaTram = null; DoManh = 0; SoLuongKetNoiMax = 0; danhsach = new ArrayList<DienThoai>();}
	public TramPhatSong(double x, double y, double R, String mtr, double dm, long sl, ArrayList<DienThoai> dsdt) {
		super(x, y, R); MaTram = mtr; DoManh = dm; SoLuongKetNoiMax = sl; this.danhsach = this.DSDTPhucVu(dsdt);;
	}
	public ArrayList<DienThoai> DSDTPhucVu(ArrayList<DienThoai> dt) {
		ArrayList<DienThoai> dsdt = new ArrayList<DienThoai>();
		for(int i = 0; i < dt.size(); i++) {
			if(dt.get(i).MaTram.equalsIgnoreCase(this.MaTram) && dt.get(i).TrangThai == true)
				dsdt.add(dt.get(i));
		}
		return dsdt;
	}
	public String toString() {
		return "\n*****\n1. Vi tri toa do: (" + x + ", " + y + ")\n2. Do manh cua tram: " + DoManh + "\n3. So luong dien thoai phuc vu toi da: " + SoLuongKetNoiMax + "\n4. Ban kinh phat song: " + R + "\n5. Danh sach cac sdt dang phuc vu:\n" + this.DSDTPhucVu(danhsach);
	}
	
	

}
 