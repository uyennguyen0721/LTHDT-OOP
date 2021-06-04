package BaiTap2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DsNhanVien ds = new DsNhanVien();
		int n = 0, a = 0;
		String st = new String();
		Scanner scanner = new Scanner(System.in);
		do {
			ds.showMenu();
			System.out.println("Nhap vao so thu tu lenh ma ban muon thuc hien: ");
			n = scanner.nextInt();
			switch(n) {
			case 1:
				scanner.nextLine();
				System.out.println("Chon bo phan nhan vien(1. A - 2. B - 3. C - 4. D)");
				a = scanner.nextInt();
				NhanVien nv;
				switch(a) {
				case 1:
					nv = new NhanVienA();
					nv.nhapNhanVien(scanner);
					ds.themNhanVien(nv);
					break;
				case 2:
					nv = new NhanVienB();
					nv.nhapNhanVien(scanner);
					ds.themNhanVien(nv);
					break;
				case 3:
					nv = new NhanVienC();
					nv.nhapNhanVien(scanner);
					ds.themNhanVien(nv);
					break;
				case 4:
					nv = new NhanVienD();
					nv.nhapNhanVien(scanner);
					ds.themNhanVien(nv);
					break;
				}
				System.out.println("Them nhan vien thanh cong!\n");
				break;
			case 2:
				do {
					System.out.println("Nhap so thu tu nhan vien can xoa: ");
					a = scanner.nextInt();
					if(a <= 0)
						System.out.println("So thu tu nhan vien khong hop le, vui long nhap lai!\n");
				}while(a <= 0);
				ds.xoaNhanVien(ds.getDsNv().get(a - 1));
				System.out.println("Xoa nhan vien thanh cong!");
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Nhap thong tin nhan vien can tim: ");
				st = scanner.nextLine();
				DsNhanVien x = ds.traCuu(st);
				System.out.println("Danh sach ket qua:\n");
				x.hienThi();
				break;
			case 4:
				scanner.nextLine();
				System.out.println("Danh sach nhan vien:\n");
				ds.hienThi();
				break;
			case 5:
				scanner.nextLine();
				ds.tinhLuong(scanner);
				break;
			case 6:
				System.out.println("Goodbye!!!");
				break;
			default:
				System.out.println("So thu tu lenh khong hop le, vui long nhap lai!\n");
				break;
			}
			
		}while(n != 6);
	}

}
