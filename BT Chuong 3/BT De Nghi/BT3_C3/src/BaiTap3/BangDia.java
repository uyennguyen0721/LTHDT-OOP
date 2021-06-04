package BaiTap3;

import java.util.Date;
import java.util.Scanner;

public class BangDia extends SanPham {
	private double doDaiPhat;
	public BangDia() {}
	public BangDia(String ma, String ten, String mota, Date ngaysx, double gia, double doDai) {
		super(ma, ten, mota, ngaysx, gia);
		this.doDaiPhat = doDai;
	}

	@Override
	public void nhap(Scanner scanner) {
		// TODO Auto-generated method stub
		super.nhap(scanner);
		System.out.println("Do dai phat: ");
		this.doDaiPhat = scanner.nextDouble();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Do dai phat: " + this.doDaiPhat + "\n");
	}

	public double getDoDaiPhat() {
		return doDaiPhat;
	}

	public void setDoDaiPhat(double doDaiPhat) {
		this.doDaiPhat = doDaiPhat;
	}
	

}
