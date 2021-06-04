package KTTH;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<SINHVIEN> SV = new ArrayList<SINHVIEN>();
		SINHVIEN sv = new SINHVIEN();
		SINHVIEN c = new SINHVIEN("24288", "Phan Quang", "Tien", "TpHCM", "CNTT", 3, 2, 2000);
		SINHVIEN d = new SNHVIEN("24297", "Nguyen Thi", "Hien", "Binh Phuoc", "KHMT", 7, 3, 2000);
		SINHVIEN e = new SINHVIEN("20102", "Phan Thi Thu", "Ha", "TpHCM", "KHMT", 16, 12, 1995);
		SINHVIEN f = new SINHVIEN("20267", "Nguyen Anh", "Tuan", "Phu Yen", "HTTTQL", 18, 5, 2000);
		SINHVIEN g = new SINHVIEN("20555", "Le Thanh", "Cong", "Binh Phuoc", "CNTT", 17, 9, 2000);
		SINHVIEN h = new SINHVIEN("20625", "Vu Ngoc", "Binh", "Binh Phuoc", "CNTT", 2, 4, 2000);
		SINHVIEN l = new SINHVIEN("20785", "Hoang Thi Thu", "Ha", "TpHCM", "HTTTQL", 13, 12, 1999);
		SINHVIEN m = new SINHVIEN("21133", "Hoang Trong", "Anh", "Bac Lieu", "KHMT", 15, 5, 1999);
		SINHVIEN o = new SINHVIEN("21333", "Le Quang", "Thang", "TpHCM", "CNTT", 7, 4, 2000);
		SINHVIEN p = new SINHVIEN("21865", "Hoang Thi My", "Thao", "TpHCM", "KHMT", 4, 1, 1999);
		SINHVIEN q = new SINHVIEN("21984", "Nguyen Thi", "Thanh", "Long An", "KHMT", 13, 7, 2000);
		SV.add(c); SV.add(d); SV.add(e); SV.add(f); SV.add(g); SV.add(h); SV.add(l); SV.add(m); SV.add(o); SV.add(p); SV.add(q);
		
		Scanner s = new Scanner(System.in);
		String st = null, sc = null;
		int n = 0, a = 0, b = 0;
		do {
			sv.ShowMenu();
			System.out.println("Nhap vao so thu tu ma ban muon thuc hien: ");
			n = s.nextInt();
			switch(n) {
			case 1:
				System.out.println("Nhap so thu tu cua sinh vien: ");
				a = s.nextInt();
				System.out.println("Thong tin sinh vien thu " + a + ":\n" + SV.get(a).toString());
				break;
			case 2:
				s.nextLine();
				System.out.println("Nhap ten 1 tinh/thanh pho: ");
				st = s.nextLine();
				System.out.println("Thong tin tat ca sinh vien co que quan thuoc tinh " + st + ": ");
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).getQueQuan().equalsIgnoreCase(st)) {
						System.out.println(SV.get(i).toString());
					}
				}
				break;
			case 3:
				SV.sort((SINHVIEN sv1, SINHVIEN sv2) -> {return sv1.getTen().compareTo(sv2.getTen());});
				System.out.println("Danh sach sinh vien theo thu tu ten tang dan: ");
				for(int i = 0; i < SV.size(); i++) {
					System.out.println((i + 1) + ". " + SV.get(i).getHoLot() + " " + SV.get(i).getTen() + "\n");
				}
				break;
			case 4:
				SV.sort((SINHVIEN sv1, SINHVIEN sv2) -> {return sv1.getHoLot().compareTo(sv2.getHoLot());});
				Collections.reverse(SV);
				System.out.println("Danh sach sinh vien theo thu tu ho lot giam dan: ");
				for(int i = 0; i < SV.size(); i++) {
					System.out.println((i + 1) + ". " + SV.get(i).getHoLot() + " " + SV.get(i).getTen() + "\n");
				}
				break;
			case 5:
				SV.sort((SINHVIEN sv1, SINHVIEN sv2) -> {
					if(sv1.getNamSinh() != sv2.getNamSinh()) 
						return sv1.getNamSinh() - sv2.getNamSinh();
					else 
						if(sv1.getThangSinh() != sv2.getThangSinh())
							return sv1.getThangSinh() - sv2.getThangSinh();
						else
							if(sv1.getNgaySinh() != sv2.getNgaySinh())
								return sv1.getNgaySinh() - sv2.getNgaySinh();
							else
								return sv1.getTen().compareTo(sv2.getTen());
				});
				System.out.println("Danh sach sinh vien theo thu tu ngay sinh: ");
				for(int i = 0; i < SV.size(); i++) {
					System.out.println((i + 1) + ". " + SV.get(i).getHoLot() + " " + SV.get(i).getTen() + " (" + SV.get(i).getNgaySinh() + "-" + SV.get(i).getThangSinh() + "-" + SV.get(i).getNamSinh() + ")\n");
				}
				break;
			case 6:
				s.nextLine();
				int tam = 0;
				System.out.println("Nhap khuon dang ten: ");
				st = s.nextLine();
				System.out.println("Danh sach sinh vien co khuon dang ten '" + st + "': ");
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).getTen().startsWith(st)) {
						System.out.println((tam + 1) + ". " + SV.get(i).getHoLot() + " " + SV.get(i).getTen() + "\n");
						tam++;
					}
				}
				break;
			case 7:
				s.nextLine();
				int temp = 0;
				System.out.println("Nhap khuon dang cuoi cua MSSV(chi nhap 3 chu so): ");
				st = s.nextLine();
				System.out.println("Danh sach sinh vien co khuon dang cuoi cua MSSV '" + st + "': ");
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).getMaSo().endsWith(st)) {
						System.out.println((temp + 1) + ". " + SV.get(i).getHoLot() + " " + SV.get(i).getTen() + " (" + SV.get(i).getMaSo() + ")\n");
						temp++;
					}
				}
				break;
			case 8:
				System.out.println("Tam biet.....!");
				break;
			default:
				break;
				
			}
				
		}while(n != 8);


	}

}
