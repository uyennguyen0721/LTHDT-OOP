package BaiTap1;

import java.util.ArrayList;

public class QLHinh {
	private ArrayList<Hinh> dsHinh = new ArrayList<>();
	public void themHinh(Hinh h) {
		dsHinh.add(h);
	}
	public void xoaHinh(String ten) {
		for(int i = 0; i < this.dsHinh.size(); i++) 
			if(this.dsHinh.get(i).getTen().contains(ten) == true)
				this.dsHinh.remove(i);
				
	}
	public void hienThi() {
		this.dsHinh.forEach(p -> System.out.println(p.toString() + "\n"));
	}
	// sap xep tang dan theo dien tich
	public void sapXepTang() {
		this.dsHinh.sort((h1, h2) -> {
			return h1.tinhDienTich() > h2.tinhDienTich() ? 1 : (h1.tinhDienTich() < h2.tinhDienTich() ? -1 : 0);
		});
	}
	// sap xep giam dan theo chu vi
	public void sapXepGiam() {
		this.dsHinh.sort((h1, h2) -> {
			return h1.tinhChuVi() > h2.tinhChuVi() ? -1 : (h1.tinhChuVi() < h2.tinhChuVi() ? 1 : 0);
		});
	}
	public void layDsLoai(String ten) {
		for(Hinh p: this.dsHinh)
			if(p.getTen().contains(ten) == true)
				System.out.println(p.toString() + "\n");
	}
	
	public ArrayList<Hinh> getDsHinh() {
		return dsHinh;
	}

	public void setDsHinh(ArrayList<Hinh> dsHinh) {
		this.dsHinh = dsHinh;
	}

}
