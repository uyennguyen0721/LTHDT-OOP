package SV;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SINHVIEN {
	private long MSSV;
	private String HoLot, Ten, NganhHoc, QueQuan;
	private int NgayS, ThangS, NamS;
	Scanner s = new Scanner(System.in);
	SINHVIEN(){
		HoLot = Ten = NganhHoc = QueQuan = null;
		NgayS = ThangS = NamS = 0;
		MSSV = 0;
	}
	SINHVIEN(long MS, String Ho, String T, String Nganh, String Que, int Ngay, int Thang, int Nam){
		MSSV = MS; HoLot = Ho; Ten = T; NganhHoc = Nganh; QueQuan = Que; NgayS = Ngay; ThangS = Thang; NamS = Nam;
	}
	public String toString() {
		return "\n1. MSSV: " + MSSV + "\n2. Ho va ten: " + HoLot + " " + Ten + "\n3. Nganh hoc: " + NganhHoc + "\n4. Que quan: " + QueQuan + "\n5. Ngay sinh: " + NgayS + "-" + ThangS + "-" + NamS;
	}
	public void setNgayThangNamS() {
		System.out.println("Nhap ngay-thang-nam sinh: ");
		int NgS = s.nextInt(), ThS = s.nextInt(), NS = s.nextInt();
		s.close();
		NgayS = NgS; ThangS = ThS; NamS = NS;
		String NgaySinh = NgayS + "-" + ThangS + "-" + NamS;
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		df.setLenient(false);
		try {
			Date NgSinh = df.parse(NgaySinh);
		}
		catch(ParseException e) {
			System.out.println("Invalid date");
		}
	}
	public int getDate() {
		return NgayS;
	}
	public int getMonth() {
		return ThangS;
	}
	public int getYear() {
		return NamS;
	}
	public boolean ChuoiT_HoLot(String T) {
		if(HoLot.indexOf(T) == 0)
			return true;
		else
			return false;
	}
	public boolean ChuoiT_Ten(String T) {
		if(Ten.indexOf(T) == 0)
			return true;
		else
			return false;
	}
	public boolean KT_2SV_CungQue(SINHVIEN sv) {
		if(this.QueQuan == sv.QueQuan)
			return true;
		else
			return false;
	}
	public boolean KT_2SV_CungNganh(SINHVIEN sv) {
		if(this.NganhHoc == sv.NganhHoc)
			return true;
		else
			return false;
	}
	
	public void NhapSV() {
		System.out.println("Nhap MSSV: ");
		MSSV = s.nextLong();
		s. nextLine();
		System.out.println("Nhap ho lot: ");
		HoLot = s.nextLine();
		System.out.println("Nhap ten: ");
		Ten = s.nextLine();
		System.out.println("Nhap ngay sinh: ");
		NgayS = s.nextInt();
		System.out.println("Nhap thang sinh: ");
		ThangS = s.nextInt();
		System.out.println("Nhap nam sinh: ");
		NamS = s.nextInt();
		s.nextLine();
		System.out.println("Nhap nganh hoc: ");
		NganhHoc = s.nextLine();
		System.out.println("Nhap que quan: ");
		QueQuan = s.nextLine();
	}
	public static void main(String[] args) {
		SINHVIEN SV1, SV2;
		SV1 = new SINHVIEN();
		SV2 = new SINHVIEN();
		String T, t;
		Scanner s = new Scanner(System.in);
		int a, x;
		System.out.println("----- MENU -----"
				+ "\n1. Nhap thong tin hai sinh vien."
				+ "\n2. In thong tin sinh vien."
				+ "\n3. Thay doi ngay thang nam sinh cua sinh vien."
				+ "\n4. Tra ve ngay sinh cua sinh vien."
				+ "\n5. Tra ve thang sinh cua sinh vien."
				+ "\n6. Tra ve nam sinh cua sinh vien."
				+ "\n7. Kiem tra 2 sinh vien co cung que quan khong."
				+ "\n8. Kiem tra 2 sinh vien co hoc cung nganh khong."
				+ "\n9. Kiem tra ho lot cua sinh vien bat dau bang chuoi T khong."
				+ "\n10. Kiem tra ten cua sinh vien co bat dau bang chuoi T khong."
				+ "\n11. Ket thuc.\n");
		do {

			System.out.println("Nhap vao so thu tu lenh bạn muon thuc hien: ");
			a = s.nextInt();
			switch(a) {
			case 1:
				System.out.println("Nhap thong tin sinh vien thu nhat:");
				SV1.NhapSV();
	            System.out.println("Nhap thong tin sinh vien thu hai:");
				SV2.NhapSV();
				break;
			case 2:
				System.out.println("\nThong tin sinh vien thu nhat: " + SV1);
				System.out.println("\nThong tin sinh vien thu hai: " + SV2);
				break;
			case 3:
				do {
					System.out.println("Chon sinh vien can thay doi: ");
					x = s.nextInt();
					if(x == 1)
						SV1.setNgayThangNamS();
					else
						SV2.setNgayThangNamS();
				}while(x < 1 || x > 2);
				break;
			case 4:
				do {
					System.out.println("Chon sinh vien can thay doi: ");
					x = s.nextInt();
					if(x == 1)
						SV1.getDate();
					else
						SV2.getDate();
				}while(x < 1 || x > 2);
				break;
			case 5:
				do {
					System.out.println("Chon sinh vien can thay doi: ");
					x = s.nextInt();
					if(x == 1)
						SV1.getMonth();
					else
						SV2.getMonth();
				}while(x < 1 || x > 2);
				break;
			case 6:
				do {
					System.out.println("Chon sinh vien can thay doi: ");
					x = s.nextInt();
					if(x == 1)
						SV1.getYear();
					else
						SV2.getYear();
				}while(x < 1 || x > 2);
				break;
			case 7:
				if(SV1.KT_2SV_CungQue(SV2))
					System.out.println(SV1.HoLot + " " + SV1.Ten + " va " + SV2.HoLot + " " + SV2.Ten + " cung que " + SV1.QueQuan);
				else
					System.out.println(SV1.HoLot + " " + SV1.Ten + " va " + SV2.HoLot + " " + SV2.Ten + " khong cung que!");
				break;
			case 8:
				if(SV1.KT_2SV_CungNganh(SV2))
					System.out.println(SV1.HoLot + " " + SV1.Ten + " va " + SV2.HoLot + " " + SV2.Ten + " hoc cung nganh " + SV1.NganhHoc);
				else
					System.out.println(SV1.HoLot + " " + SV1.Ten + " va " + SV2.HoLot + " " + SV2.Ten + " khong hoc cung nganh!");
				break;
			case 9:
				System.out.println("\nNhap chuoi T: ");
				T = s.nextLine();
				do {
					System.out.println("Chon sinh vien can kiem tra: ");
					x = s.nextInt();
					if(x == 1)
						if(SV1.ChuoiT_HoLot(T))
							System.out.println("Ho lot cua sinh vien " + SV1.Ten + " bat dau bang chuoi " + T);
						else
							System.out.println("Ho lot cua sinh vien " + SV1.Ten + " khong bat dau bang chuoi " + T);
					else
						if(SV2.ChuoiT_HoLot(T))
							System.out.println("Ho lot cua sinh vien " + SV2.Ten + " bat dau bang chuoi " + T);
						else
							System.out.println("Ho lot cua sinh vien " + SV2.Ten + " khong bat dau bang chuoi " + T);
				}while(x < 1 || x > 2);
				break;
			case 10:
				System.out.println("\nNhap chuoi T: ");
				T = s.nextLine();
				do {
					System.out.println("Chon sinh vien can kiem tra: ");
					x = s.nextInt();
					if(x == 1)
						if(SV1.ChuoiT_Ten(T))
							System.out.println("Ten cua sinh vien " + SV1.Ten + " bat dau bang chuoi " + T);
						else
							System.out.println("Ten cua sinh vien " + SV1.Ten + " khong bat dau bang chuoi " + T);
					else
						if(SV2.ChuoiT_HoLot(T))
							System.out.println("Ten cua sinh vien " + SV2.Ten + " bat dau bang chuoi " + T);
						else
							System.out.println("Ten cua sinh vien " + SV2.Ten + " khong bat dau bang chuoi " + T);
				}while(x < 1 || x > 2);
				break;
			case 11:
				System.out.println("\nTam biet...!\n");
				break;
			default:
				break;
			}
		}while(a >= 1 && a <= 11);
	}


}
