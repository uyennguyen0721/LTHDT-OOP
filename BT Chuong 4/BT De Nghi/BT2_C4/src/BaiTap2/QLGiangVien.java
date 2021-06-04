package BaiTap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLGiangVien {
	private List<GiangVien> gvs = new ArrayList<>();
	public void themGv(GiangVien Gv) {
		gvs.add(Gv);
	}
	public void xoaGv(GiangVien Gv) {
		for(int i = 0; i < gvs.size(); i++) {
			if(gvs.get(i) == Gv)
				gvs.remove(i);
		}
	}
	public QLGiangVien traCuu(String tuKhoa) {
		QLGiangVien ds = new QLGiangVien();
		for(GiangVien p: gvs)
			if(p.getHoTen().toLowerCase().contains(tuKhoa.toLowerCase()) == true || p.getHocHam().toLowerCase().contains(tuKhoa.toLowerCase()) == true || p.getHocVi().toLowerCase().contains(tuKhoa.toLowerCase()) == true)
				ds.themGv(p);
		return ds;
	}
	public void sapXep() {
		this.gvs.sort((gv1, gv2) -> gv1.compareTo(gv2));
	}
	public void tinhTienLuong(Scanner scanner) {
		for(GiangVien p: gvs) {
			System.out.printf("Nhap so gio cua GV %s: ", p.getHoTen());
			float soGio = scanner.nextInt();
			p.setTienLuong(p.tinhTienLuong(soGio));
		}
		this.sapXep();
		for(GiangVien p: this.gvs)
			System.out.println(p);
		
	}
	

	@Override
	public String toString() {
		String s ="";
		for(GiangVien p: this.gvs)
			s += p;
		return s;
	}
	public List<GiangVien> getGvs() {
		return gvs;
	}

	public void setGvs(List<GiangVien> gvs) {
		this.gvs = gvs;
	}

}
