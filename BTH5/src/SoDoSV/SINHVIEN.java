package SoDoSV;
import java.util.*;
import java.text.*;
import java.io.*;

public class SINHVIEN {
	private String HoLot, Ten, QueQuan, NganhHoc, MSSV;
	private int NgayS, ThangS, NamS, VTCho, VTDay;
	Scanner sc = new Scanner(System.in);
	SINHVIEN(){
		HoLot = Ten = NganhHoc = QueQuan = MSSV = null;
		NgayS = ThangS = NamS = VTCho = VTDay = 0;
	}
	SINHVIEN(int VTC, int VTD, String HL, String T, String MS, int NgS, int ThS, int NS, String NH, String QQ){
		VTCho = VTC; VTDay = VTD; HoLot = HL; Ten = T; MSSV = MS; NgayS = NgS; ThangS = ThS; NamS = NS; NganhHoc = NH; QueQuan = QQ;
	}
	public String toString() {
		return "\n1. Vi tri cho: " + VTCho + "\n2. Vi tri day: " + VTDay + "\n3. MSSV: " + MSSV + "\n4. Ho va ten: " + HoLot + " " + Ten + "\n5. Ngay sinh: " + NgayS + "-" + ThangS + "-" + NamS + "\n6. Nganh hoc: " + NganhHoc + "\n7. Que quan: " + QueQuan +"\n";
	}
	public static void ShowMenu() {
		System.out.println("\n----- MENU -----"
				+ "\n1. In ra thong tin cac sinh vien ngoi o day ban ma nguoi dung yeu cau."
				+ "\n2. In ra thong tin cac sinh vien ngoi o vi tri ma nguoi dung yeu cau cua tat ca cac day ban."
				+ "\n3. In ra thong tin cac sinh vien ngoi o day m vi tri cho n ma nguoi dung yeu cau."
				+ "\n4. In ra thong tin cac sinh vien co khuon dang ten vua nhap."
				+ "\n5. In ra thong tin cac sinh vien sinh vao thang do nguoi dung nhap."
				+ "\n6. In ra thong tin cac sinh vien hoc nganh K do nguoi dung yeu cau."
				+ "\n7. In ra thong tin cac sinh vien co que quan Q do nguoi dung yeu cau."
				+ "\n8. In ra thong tin cac sinh vien co khuon dang dau cua MSSV nhu nguoi dung nhap."
				+ "\n9. In ra thong tin cac sinh vien co khuon dang cuoi cua MSSV nhu nguoi dung nhap."
				+ "\n10. Cho phep doi cho ngoi cua 2 SV(luu y phai cap nhat lai tap tin de lan sau su dung)."
				+ "\n11. Liet ke cac vi tri co kha nang xay ra tinh huong 'nho cay nguoi khac' de giam thi phong thi doi cho."
				+ "\n12. Ket thuc chuong trinh.\n");
	}
	static void FillData(String[] s, SINHVIEN[] ds, int pos) {
		int vtc = Integer.valueOf(s[0]), vtd = Integer.valueOf(s[1]);
		String mssv = s[2], holot = s[3], ten = s[4];
		String[] tokens = s[5].split("-");
		int ngay = Integer.valueOf(tokens[0]), thang = Integer.valueOf(tokens[1]), nam = Integer.valueOf(tokens[2]);
		String nganh = s[6], quequan = s[7];
		ds[pos] = new SINHVIEN(vtc, vtd, holot, ten, mssv, ngay, thang, nam, nganh, quequan);
	}
	static int ReadData(String fname, SINHVIEN[] ds) {
		int soluong = 0;
		File f = new File(fname);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String st;
			while((st = br.readLine()) != null) {
				String[] tokens = st.split(",");
				soluong++;
				if(soluong == 1) 
					continue;
				else
					FillData(tokens, ds, soluong);
			}
		}
		catch(Exception e) {
			System.out.println("Loi tap tin");
		}
		return soluong - 1;
	}
	public static void TTSV_DayBan(int n, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].VTDay == n)
				System.out.println(ds[i]);
		}
	}
	public static void TTSV_ChoNgoi(int n, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].VTCho == n)
				System.out.println(ds[i]);
		}
	}
	public static void TTSV_VT(int m, int n, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].VTCho == m && ds[i].VTDay == n)
				System.out.println(ds[i]);
		}
	}
	public static void TTSV_Ten(String ten, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].Ten.equalsIgnoreCase(ten)) {
				System.out.println(ds[i]);
			}
		}
	}
	public static void TTSV_Thang(int thang, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].ThangS == thang ) {
				System.out.println(ds[i]);
			}
		}
	}
	public static void TTSV_Nganh(String nganh, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].NganhHoc.equalsIgnoreCase(nganh)) {
				System.out.println(ds[i]);
			}
		}
	}
	public static void TTSV_QueQuan(String que, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].QueQuan.equalsIgnoreCase(que)) {
				System.out.println(ds[i]);
			}
		}
	}
	public static void TTSV_DauMSSV(String MS, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].MSSV.startsWith(MS) == true) {
				System.out.println(ds[i]);
			}
		}
	}
	public static void TTSV_CuoiMSSV(String MS, SINHVIEN[] ds) {
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			if(ds[i].MSSV.endsWith(MS) == true) {
				System.out.println(ds[i]);
			}
		}
	}
	public static void DoiCho_2SV(SINHVIEN[] ds, int i, int j) throws IOException {
		File f = new File("D:\\SoDoSinhVien.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		int tam = ds[i].VTCho;
		ds[i].VTCho = ds[j].VTCho;
		ds[i].VTCho = tam;
		int temp = ds[i].VTDay;
		ds[i].VTDay = ds[j].VTDay;
		ds[j].VTDay = temp;
		bw.write(ds + System.getProperty("line.separator"));
	}
	public static void PhatHienNhoCay(SINHVIEN[] ds) {
		String[] s = new String[2];
		for(int i = 0; i < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
			for(int j = 0; j < ReadData("D:\\SoDoSinhVien.txt", ds); i++) {
				if(i != j && ds[i].VTDay == ds[j].VTDay && ds[j].VTCho == (ds[i].VTCho + 1)) {
					if(ds[i].NganhHoc == ds[j].NganhHoc || ds[i].QueQuan == ds[j].QueQuan)
						System.out.println("(" + ds[i].VTDay + ";" + ds[i].VTCho + ")");
				}
			}
		}
	}
	
}
