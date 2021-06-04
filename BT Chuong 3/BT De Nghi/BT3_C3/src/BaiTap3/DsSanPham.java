package BaiTap3;

import java.util.ArrayList;

public class DsSanPham {
	private ArrayList<SanPham> sp = new ArrayList<>();
	public void themSanPham(SanPham s) {
		this.sp.add(s);
	}
	public void xoaSanPham(SanPham p) {
		for(int i = 0; i < sp.size(); i++)
			if(sp.get(i).getMaSP().equals(p.getMaSP()) && sp.get(i).getTenSP().contains(p.getTenSP()))
				this.sp.remove(i);
	}
	public void xoaSanPham(String maSP) {
		sp.removeIf(p -> p.getMaSP().equals(maSP));			
	}
	
	public ArrayList<SanPham> timKiem(String kw){
		ArrayList<SanPham> kq = new ArrayList<>();
		this.sp.forEach(p -> {
			if(p.getTenSP().contains(kw) == true || p.getMaSP().equals(kw))
				kq.add(p);
		});
		return kq;
	}
	public ArrayList<SanPham> timKiem(double tuGia, double denGia) {
		ArrayList<SanPham> kq = new ArrayList<>();
		this.sp.forEach(p -> {
			if(p.getGiaBan() >= tuGia && p.getGiaBan() <= denGia)
				kq.add(p);
		});
		return kq;
	}
	public void sapXep() {
		this.sp.sort((p1, p2) -> {
			return p1.getGiaBan() > p2.getGiaBan() ? -1 : (p1.getGiaBan() < p2.getGiaBan() ? 1 : 0);
		});
	}
	public void capNhatSanPham(String maSP, String tenSP, String moTa, double giaBan) {
		this.sp.forEach(p -> {
			if(p.getMaSP().equals(maSP)) {
				p.setTenSP(tenSP);
				p.setMoTa(moTa);
				p.setGiaBan(giaBan);
			}
		});
	}
	public void hienThi() {
		this.sp.forEach(p -> {
			p.xuat();
		});
	}
	public void showMenu() {
		System.out.println("\n----- MENU -----"
				+ "\n1. Them san pham."
				+ "\n2. Xoa san pham."
				+ "\n3. Cap nhat san pham."
				+ "\n4. Tim kiem san pham."
				+ "\n5. Sap xep cac san pham giam dan theo gia."
				+ "\n6. Xem danh sach san pham."
				+ "\n7. Ket thuc.");
	}

	public ArrayList<SanPham> getSp() {
		return sp;
	}

	public void setSp(ArrayList<SanPham> sp) {
		this.sp = sp;
	}
	

}
