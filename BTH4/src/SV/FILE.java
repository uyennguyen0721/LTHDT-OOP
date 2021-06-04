package SV;
import java.io.*;
import java.util.*;

public class FILE extends SINHVIEN{
	private long MSSV;
	private String HoLot, Ten, NganhHoc, QueQuan;
	private int NgayS, ThangS, NamS;
	Scanner s = new Scanner(System.in);
	FILE(){
		HoLot = Ten = NganhHoc = QueQuan = null;
		NgayS = ThangS = NamS = 0;
		MSSV = 0;
	}
	FILE(long MS, String Ho, String T, String Nganh, String Que, int Ngay, int Thang, int Nam){
		MSSV = MS; HoLot = Ho; Ten = T; NganhHoc = Nganh; QueQuan = Que; NgayS = Ngay; ThangS = Thang; NamS = Nam;
	}
	public String toString() {
		return "\n1. MSSV: " + MSSV + "\n2. Ho va ten: " + HoLot + " " + Ten + "\n3. Nganh hoc: " + NganhHoc + "\n4. Que quan: " + QueQuan + "\n5. Ngay sinh: " + NgayS + "-" + ThangS + "-" + NamS;
	}
	public void ShowMenu() {
		System.out.println("\n----- MENU -----"
				+ "\n1. In thông tin tất cả sinh viên."
				+ "\n2. In tất cả sinh viên có họ lót bắt đầu bằng chuỗi T."
				+ "\n3. In tất cả sinh viên có tên bắt đầu bằng chuỗi T."
				+ "\n4. In ra các sinh viên cùng quê hoặc cùng ngành với sinh viên mà NSD chọn."
				+ "\n5. In ra các sinh viên có ngày sinh mà NSD nhập từ bàn phím."
				+ "\n6. Kết thúc chương trình.");
	}
	public static void main() throws FileNotFoundException{
		FILE SV[] = new FILE[4000], f = new FILE();
		String T, st;
		int i = 0, n, t;
		File file = new File("D:\\Lập Trình Hướng Đối Tượng\\SINHVIEN.txt");
		Scanner s = new Scanner(file, " UTF-8");
		while(s.hasNextLine()) {
			String line = s.nextLine();
			String []str = line.split("\\,");
			String []str1 = str[3].split("\\-");
			SV[i] = new FILE();
			SV[i].MSSV = Long.parseLong(str[0]);
			SV[i].HoLot = str[1];
			SV[i].Ten = str[2];
			SV[i].NgayS = Integer.parseInt(str1[0]);
			SV[i].ThangS = Integer.parseInt(str1[1]);
			SV[i].NamS = Integer.parseInt(str1[2]);
			SV[i].NganhHoc = str[4];
			SV[i].QueQuan = str[5];
			i++;
		}
		do {
			f.ShowMenu();
			System.out.println("\nNhap vao so thu tu lenh ban muon thuc hien: ");
			n = s.nextInt();
			switch(n) {
			case 1:
				for(int a = 0; a <= i; a++) {
					System.out.println(a + ". Thông tin sinh viên thứ " + (a+1) + ": " + SV[a] + "\n");
				}
				break;
			case 2:
				System.out.println("\nNhap chuoi T: ");
				T = s.nextLine();
				System.out.println("\nNhung SV co ho lot bat dau bang " + T + ": ");
				for(int a = 0; a <= i; a++) {
					if(SV[a].ChuoiT_HoLot(T)) {
						System.out.println(SV[a] + "\n");
					}
				}
				break;
			case 3:
				System.out.println("\nNhap chuoi T: ");
				T = s.nextLine();
				System.out.println("\nNhung SV co ten bat dau bang " + T + ": ");
				for(int a = 0; a <= i; a++) {
					if(SV[a].ChuoiT_Ten(T)) {
						System.out.println(SV[a] + "\n");
					}
				}
				break;
			case 4: 
				System.out.println("\nNhap MSSV ma ban chon: ");
				t = s.nextInt();
				System.out.println("\nThong tin sinh vien: ");
				for(int a = 0; a <= i; a++) {
					if(SV[a].MSSV == n) {
						t = a;
						System.out.println(SV[a] + "\n");
					}
					
				}
				do {
					System.out.println("\nBan muon in ra cac sinh vien:"
							+ "\n1. Cung Que"
							+ "\n2. Cung Nganh"
							+ "\nvoi sinh vien tren?");
					int x = s.nextInt();
					switch(x) {
					case 1:
						System.out.println("\nCac sinh vien cung que voi sinh vien tren: ");
						for(int a = 0; a <= i; a++) {
							if(SV[a].QueQuan == SV[t].QueQuan && a != t) {
								System.out.println(SV[a] + "\n");
							}
						}
						break;
					case 2:
						System.out.println("\nCac sinh vien cung nganh voi sinh vien tren: ");
						for(int a = 0; a <= i; a++) {
							if(SV[a].NganhHoc == SV[a].NganhHoc && a != t) {
								System.out.println(SV[a] + "\n");
							}
						}
						break;
					default:
						break;
					}
					System.out.println("\nBan co muon tiep tuc khong?(Y/N)");
					st = s.nextLine();
				}while(st == "Y");
				break;
			case 5:
				System.out.println("\nNhap ngay sinh: ");
				int D = s.nextInt();
				System.out.println("\nNhap thang sinh: ");
				int M = s.nextInt();
				System.out.println("\nDanh sach sinh vien co ngay sinh " + D + "-" + M + " la:\n");
				for(int a = 0; a <= i; a++) {
					if(SV[a].NgayS == D && SV[a].ThangS == M) {
						System.out.println(SV[a] + "\n");
					}
				}
				break;
			case 6:
				System.out.println("\nTam biet...!");
				break;
			default:
				break;
			}
			System.out.println("\nBan co muon tiep tuc khong?(Y/N)");
			st = s.nextLine();
			
		}while(st == "Y");


	}

}
