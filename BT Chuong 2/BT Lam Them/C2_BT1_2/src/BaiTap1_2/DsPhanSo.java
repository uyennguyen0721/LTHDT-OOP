package BaiTap1_2;

import java.util.*;

public class DsPhanSo {
	private ArrayList<PhanSo> ds = new ArrayList<>();
	public void themPhanSo(PhanSo p) {
		ds.add(p);
	}
	public void xoaPhanSo(PhanSo p) {
		for(int i = 0; i < ds.size(); i++)
			if(ds.get(i) == p)
				ds.remove(i);
	}
	public PhanSo tinhTong() {
		PhanSo tong = new PhanSo(0, 1);
		for(int i = 0; i < ds.size(); i++)
			tong = tong.congPS(ds.get(i));
		tong = tong.rutGon();
		return tong;
	}
	public void sapXep() {
		ds.sort((PhanSo p1, PhanSo p2) -> {
			return p1.soSanh(p2);
		});
	}
	public void hienThi() {
		ds.forEach((PhanSo p) -> p.hienThi());
	}
	

}
