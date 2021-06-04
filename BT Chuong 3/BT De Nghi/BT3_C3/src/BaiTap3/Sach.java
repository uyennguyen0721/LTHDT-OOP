package BaiTap3;

import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham {
	private int soTrang;
	public Sach() {}
	public Sach(String ma, String ten, String mota, Date ngaysx, double gia, int trang) {
		super(ma, ten, mota, ngaysx, gia);
		this.soTrang = trang;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public void nhap(Scanner scanner) {
		// TODO Auto-generated method stub
		super.nhap(scanner);
		System.out.println("So trang: ");
		this.soTrang = scanner.nextInt();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("So trang: " + this.soTrang + "\n");
	}

}
