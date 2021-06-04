package BaiTap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DsNhanVien {
	private List<NhanVien> dsNv = new ArrayList<>();
	public void themNhanVien(NhanVien nv) {
		this.dsNv.add(nv);
	}
	public void themNhanVien(Scanner scanner) {
		NhanVien nv = new NhanVien();
		nv.nhapNhanVien(scanner);
		this.themNhanVien(nv);
	}
	public void xoaNhanVien(NhanVien nv) {
		this.dsNv.removeIf(p -> p.getMaSo() == nv.getMaSo());
	}
	public DsNhanVien traCuu(String tuKhoa) {
		DsNhanVien ds = new DsNhanVien();
		for(NhanVien p: this.dsNv)
			if(p.getCmnd().equals(tuKhoa) || p.getHoTen().contains(tuKhoa) == true || p.getQueQuan().contains(tuKhoa) == true)
				ds.themNhanVien(p);
		return ds;
	}
	public void tinhLuong(Scanner scanner) {
		this.dsNv.forEach(nv -> {
			System.out.printf("Nhap so ngay lam cua %s: ", nv.getHoTen());
			int nc = scanner.nextInt();
			System.out.printf("\n=====Tien luong: %.2f\n\n-----\n", nv.tinhLuong(nc));
		});
	}
	// sap xep giam
	public void sapXep() {
		this.dsNv.sort((nv1, nv2) -> {
			return nv1.getTienLuong() > nv2.getTienLuong() ? -1 : (nv1.getTienLuong() < nv2.getTienLuong() ? 1 : 0);
		});
	}
	public void hienThi() {
		this.dsNv.forEach(p -> System.out.println(p.toString() + "\n"));
	}
	public void showMenu() {
		System.out.println("\n----- MENU -----\n"
				+ "\n1. Them nhan vien."
				+ "\n2. Xoa nhan vien."
				+ "\n3. Tra cuu nhan vien."
				+ "\n4. hien thi danh sach nhan vien."
				+ "\n5. Tinh luong nhan vien."
				+ "\n6. Ket thuc.\n");
	}

	public List<NhanVien> getDsNv() {
		return dsNv;
	}

	public void setDsNv(List<NhanVien> dsNv) {
		this.dsNv = dsNv;
	}

}
