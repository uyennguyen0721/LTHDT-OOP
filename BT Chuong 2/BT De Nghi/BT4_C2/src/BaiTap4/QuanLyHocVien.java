package BaiTap4;
import java.util.*;

public class QuanLyHocVien {
	private ArrayList<HocVien> ds = new ArrayList<>();
	public void themHocVien(HocVien d) {
		this.ds.add(d);
	}
	public void themHocVien(Scanner scanner) {
		HocVien h = new HocVien();
		h.nhapHocVien(scanner);
//		this.themHocVien(h);
		this.ds.add(h);
	}
	public void hienThiDs() {
		this.ds.forEach((HocVien h) -> {
			h.hienThi();
			System.out.println("\n---------");
		}); 
//		for(HocVien h: this.ds)
//			h.hienThi();
	}
	public HocVien timKiem(int maSo) {
		for(HocVien h: this.ds)
			if(h.getMaSo() == maSo)
				return h;
		return null;
	}
	public ArrayList<HocVien> timKiem(String keywork) {
		ArrayList<HocVien> kq = new ArrayList<>();
		keywork = keywork.toLowerCase();
		for(HocVien h: this.ds)
			// contains kiem tra xem co chua tu khoa do khong
			if(h.getHoTen().toLowerCase().contains(keywork) == true || h.getQueQuan().toLowerCase().contains(keywork) == true)
				kq.add(h);
		return kq;		
	}
	//sap xep tang... sap xep giam thi doi h1 thanh h2, h2 thanh h1
	public void sapXep() {
		this.ds.sort((HocVien h1, HocVien h2) -> {
			return h1.tinhTrungBinh() > h2.tinhTrungBinh() ? 1 : (h1.tinhTrungBinh() < h2.tinhTrungBinh() ? -1 : 0);
			
//			if(h1.tinhTrungBinh() > h2.tinhTrungBinh())
//				return 1;
//			else
//				if(h1.tinhTrungBinh() < h2.tinhTrungBinh())
//					return -1;
//			return 0;
			
//			return h1.getMaSo() - h2.getMaSo();
		});
	}
	public void nhapDiemDs(Scanner scanner) {
		this.ds.forEach((HocVien h) -> {
			System.out.printf("Nhap diem cho %s\n", h.getHoTen().toUpperCase());
			h.nhapDiem(scanner);
		});
//		for(HocVien h: this.ds)
//			h.nhapDiem(scanner);
	}
	public ArrayList<HocVien> xetHocBong() {
		ArrayList<HocVien> kq = new ArrayList<>();
		for(HocVien h: this.ds)
			if(h.isHocBong() == true)
				kq.add(h);
		return kq;
	}
	public ArrayList<HocVien> getDs() {
		return ds;
	}
	
	

}
