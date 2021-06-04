package SINHVIEN;
import java.util.*;
import java.io.*;
import java.text.*;


public class Main {
	public static void main(String[] args) throws Exception{
		ArrayList<ArrayList_SV> SV = new ArrayList<ArrayList_SV>();
		ArrayList_SV sv = new ArrayList_SV();
		Scanner s = new Scanner(System.in);
		String st = null, sc = null;
		int n = 0, a = 0, b = 0, slsv = sv.ReadData("D:\\SinhVien.txt", SV);
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
					if(SV.get(i).QueQuan.equalsIgnoreCase(st)) {
						System.out.println(SV.get(i).toString());
					}
				}
				break;
			case 3:
				SV.sort((ArrayList_SV sv1, ArrayList_SV sv2) -> {return sv1.Ten.compareTo(sv2.Ten);});
				System.out.println("Danh sach sinh vien theo thu tu ten tang dan: ");
				for(int i = 0; i < SV.size(); i++) {
					System.out.println((i + 1) + ". " + SV.get(i).HoLot + " " + SV.get(i).Ten + "\n");
				}
				break;
			case 4:
				SV.sort((ArrayList_SV sv1, ArrayList_SV sv2) -> {return sv1.HoLot.compareTo(sv2.HoLot);});
				Collections.reverse(SV);
				System.out.println("Danh sach sinh vien theo thu tu ho lot giam dan: ");
				for(int i = 0; i < SV.size(); i++) {
					System.out.println((i + 1) + ". " + SV.get(i).HoLot + " " + SV.get(i).Ten + "\n");
				}
				break;
			case 5:
				s.nextLine();
				int dem = 0;
				System.out.println("Nhap ngay sinh: ");
				a = s.nextInt();
				System.out.println("Nhap thang sinh: ");
				b = s.nextInt();
				System.out.println("Danh sach sinh vien sinh ngay " + a + "-" + b + ": ");
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).NgayS == a && SV.get(i).ThangS == b) {
						System.out.println((dem + 1) + ". " + SV.get(i).HoLot + " " + SV.get(i).Ten + " (" + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + ")\n");
						dem++;
					}
				}
				break;
			case 6:
				SV.sort((ArrayList_SV sv1, ArrayList_SV sv2) -> {
					if(sv1.NamS != sv2.NamS) 
						return sv1.NamS - sv2.NamS;
					else 
						if(sv1.ThangS != sv2.ThangS)
							return sv1.ThangS - sv2.ThangS;
						else
							if(sv1.NgayS != sv2.NgayS)
								return sv1.NgayS - sv2.NgayS;
							else
								return sv1.Ten.compareTo(sv2.Ten);
				});
				System.out.println("Danh sach sinh vien theo thu tu ngay sinh: ");
				for(int i = 0; i < SV.size(); i++) {
					System.out.println((i + 1) + ". " + SV.get(i).HoLot + " " + SV.get(i).Ten + " (" + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + ")\n");
				}
				break;
			case 7:
				s.nextLine();
				int tam = 0;
				System.out.println("Nhap khuon dang ten: ");
				st = s.nextLine();
				System.out.println("Danh sach sinh vien co khuon dang ten '" + st + "': ");
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).Ten.startsWith(st)) {
						System.out.println((tam + 1) + ". " + SV.get(i).HoLot + " " + SV.get(i).Ten + "\n");
						tam++;
					}
				}
				break;
			case 8:
				s.nextLine();
				int temp = 0;
				System.out.println("Nhap khuon dang cuoi cua MSSV(chi nhap 3 chu so): ");
				st = s.nextLine();
				System.out.println("Danh sach sinh vien co khuon dang cuoi cua MSSV '" + st + "': ");
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).MSSV.endsWith(st)) {
						System.out.println((temp + 1) + ". " + SV.get(i).HoLot + " " + SV.get(i).Ten + " (" + SV.get(i).MSSV + ")\n");
						temp++;
					}
				}
				break;
			case 9:
				s.nextLine();
				int t = 0;
				ArrayList_SV Sv = new ArrayList_SV();
				String str = new String();
				System.out.println("Nhap nganh hoc can sua: ");
				st = s.nextLine();
				System.out.println("Nhap nganh moi: ");
				sc = s.nextLine();
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).NganhHoc.equalsIgnoreCase(st)) {
						Sv = new ArrayList_SV(SV.get(i).MSSV, SV.get(i).HoLot, SV.get(i).Ten, SV.get(i).NgayS, SV.get(i).ThangS, SV.get(i).NamS, sc, SV.get(i).QueQuan);
						SV.set(i, Sv);
					}
				}
				sv.DeleteData("D:\\SinhVien.txt");
				for(int i = 0; i < SV.size(); i++) {
					if(i != SV.size())
						str = new String(SV.get(i).MSSV + "," + SV.get(i).HoLot + "," + SV.get(i).Ten + "," + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + "," + SV.get(i).NganhHoc + "," + SV.get(i).QueQuan + "\r\n");
					else
						str = new String(SV.get(i).MSSV + "," + SV.get(i).HoLot + "," + SV.get(i).Ten + "," + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + "," + SV.get(i).NganhHoc + "," + SV.get(i).QueQuan);
					sv.WriteData("D:\\SinhVien.txt", str);
				}
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).NganhHoc.equalsIgnoreCase(st))
						t++;
				}
				if(t == 0)
					System.out.println("Sua doi thong tin thanh cong!");
				else
					System.out.println("Sua doi thong tin khong thanh cong!");
				break;
			case 10:
				s.nextLine();
				String str1 = new String();
				System.out.println("Nhap vi tri sinh vien thu nhat: ");
				a = s.nextInt();
				System.out.println("Nhap vi tri sinh vien thu hai: ");
				b = s.nextInt();
				System.out.println("Vi tri hai sinh vien truoc khi sua:\n" + "-" + SV.get(a).HoLot + " " + SV.get(a).Ten + " (" + a + ")\n" + "-" + SV.get(b).HoLot + " " + SV.get(b).Ten + " (" + b + ")\n");
				ArrayList_SV tamp = SV.get(a);
				SV.set(a, SV.get(b));
				SV.set(b, tamp);
				sv.DeleteData("D:\\SinhVien.txt");
				for(int i = 0; i < SV.size(); i++) {
					if(i != SV.size())
						str1 = new String(SV.get(i).MSSV + "," + SV.get(i).HoLot + "," + SV.get(i).Ten + "," + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + "," + SV.get(i).NganhHoc + "," + SV.get(i).QueQuan + "\r\n");
					else
						str1 = new String(SV.get(i).MSSV + "," + SV.get(i).HoLot + "," + SV.get(i).Ten + "," + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + "," + SV.get(i).NganhHoc + "," + SV.get(i).QueQuan);
					sv.WriteData("D:\\SinhVien.txt", str1);
				}
				System.out.println("Vi tri hai sinh vien sau khi sua:\n" + "-" + SV.get(a).HoLot + " " + SV.get(a).Ten + " (" + a + ")\n" + "-" + SV.get(b).HoLot + " " + SV.get(b).Ten + " (" + b + ")\n");
				break;
			case 11:
				s.nextLine();
				int x = 0;
				String str2 = new String();
				System.out.println("Nhap nganh hoc cua cac sinh vien can xoa: ");
				st = s.nextLine();
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).NganhHoc.equalsIgnoreCase(st)) {
						SV.remove(i);
						i--;
					}
				}
				sv.DeleteData("D:\\SinhVien.txt");
				for(int i = 0; i < SV.size(); i++) {
					if(i != SV.size())
						str2 = new String(SV.get(i).MSSV + "," + SV.get(i).HoLot + "," + SV.get(i).Ten + "," + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + "," + SV.get(i).NganhHoc + "," + SV.get(i).QueQuan + "\r\n");
					else
						str2 = new String(SV.get(i).MSSV + "," + SV.get(i).HoLot + "," + SV.get(i).Ten + "," + SV.get(i).NgayS + "-" + SV.get(i).ThangS + "-" + SV.get(i).NamS + "," + SV.get(i).NganhHoc + "," + SV.get(i).QueQuan);
					sv.WriteData("D:\\SinhVien.txt", str2);
				}
				for(int i = 0; i < SV.size(); i++) {
					if(SV.get(i).NganhHoc.equalsIgnoreCase(st))
						x++;
				}
				if(x == 0)
					System.out.println("Xoa thanh cong...Nganh nay khong con ton tai trong danh sach!");
				else
					System.out.println("Xoa that bai...Nganh nay van con ton tai trong danh sach!");
				break;
			case 12:
				System.out.println("Tam biet.....!");
				break;
			default:
				break;
				
			}
				
		}while(n > 0 && n < 12);
	}


}
