package BaiTap3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DsSanPham ds = new DsSanPham();
		SanPham sp;
		int  n = 0, a = 0, i = 0;
		String st = new String();
		do {
			ds.showMenu();
			System.out.println("Nhap vao so thu tu ma ban muon thuc hien: ");
			n = s.nextInt();
			switch(n) {
			case 1:
				do {
					System.out.println("Ban muon them loai san pham nao?(1. Sach - 2. Bang dia)");
					a = s.nextInt();
					if(a == 1) {
						sp = new Sach();
						System.out.println("Nhap thong tin SACH:\n");
						sp.nhap(s);
						ds.themSanPham(sp);
					}
					else
						if(a == 2) {
							sp = new BangDia();
							System.out.println("Nhap thong tin BANG DIA:\n");
							sp.nhap(s);
							ds.themSanPham(sp);
						}
						else
							System.out.println("Rat tiec san pham khong the them vi khong nam trong danh muc san pham, vui long chon lai!\n");
					
				}while (a != 1 && a != 2);
				break;
			case 2:
				do {
					System.out.println("Chon phuong thuc truyen vao: (1. Doi tuong san pham - 2. Ma san pham)");
					a = s.nextInt();
					if(a == 1) {
						System.out.println("*** XOA THEO DOI DUONG SAN PHAM ***\n");
						do {
							System.out.println("Nhap vao thu tu doi tuong san pham can xoa: ");
							i = s.nextInt();
							if(i <= 0)
								System.out.println("Thu tu san pham khong hop le, vui long nhap lai!");
						}while(i <= 0);
						ds.xoaSanPham(ds.getSp().get(i - 1));
						System.out.println("Xoa san pham thanh cong!");
					}
					else
						if(a == 2) {
							s.nextLine();
							System.out.println("*** XOA THEO MA SAN PHAM ***\nNhap vao ma san pham can xoa: ");
							st = s.nextLine();
							ds.xoaSanPham(st);
							System.out.println("Xoa san pham thanh cong!");
						}
						else
							System.out.println("Rat tiec san pham khong the xoa, vui long thu lai!\n");
				}while (a != 1 && a != 2);
				break;
			case 3:
				s.nextLine();
				System.out.println("Nhap ma san pham can cap nhat: ");
				st = s.nextLine();
				System.out.println("Nhap lai ten san pham: ");
				String tenSP = s.nextLine();
				System.out.println("Nhap lai mo ta san pham: ");
				String moTa = s.nextLine();
				System.out.println("Nhap lai gia cua san pham: ");
				double giaBan = s.nextDouble();
				ds.capNhatSanPham(st, tenSP, moTa, giaBan);
				System.out.println("Cap nhat san pham thanh cong!");
				break;
			case 4:
				do {
					System.out.println("Ban muon tim kiem theo hinh thuc nao? (1. Ma hoac ten san pham - 2. Gia san pham)");
					a = s.nextInt();
					if(a == 1) {
						s.nextLine();
						System.out.println("\nNhap thong tin can tim kiem: ");
						st = s.nextLine();
						System.out.println("\nKet qua tra ve:\n");
						for(SanPham p: ds.timKiem(st))
							p.xuat();
					}
					else
						if(a == 2) {
							s.nextLine();
							System.out.println("\nNhap thong tin can tim kiem: ");
							double x = s.nextDouble();
							double y = s.nextDouble();
							System.out.println("\nKet qua tra ve:\n");
							for(SanPham p: ds.timKiem(x, y))
								p.xuat();
						}
						else
							System.out.println("Tim kiem khong thanh cong, vui long thu lai!\n");
				}while (a != 1 && a != 2);
				break;
			case 5:
				ds.sapXep();
				System.out.println("Danh sach sau khi da SAP XEP:\n");
				ds.hienThi();
				break;
			case 6:
				System.out.println("Danh sach san pham:\n");
				ds.hienThi();
				break;
			case 7:
				System.out.println("Goodbye!!!");
				break;
			default:
				System.out.println("Lenh ban chon khong ton tai, vui long thu lai!");
				break;	
			}
			
		}while(n != 7);
		
		
	}

}
