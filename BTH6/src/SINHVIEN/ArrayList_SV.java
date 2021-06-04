package SINHVIEN;
import java.util.*;
import java.io.*;
import java.text.*;


public class ArrayList_SV {
	public String MSSV, HoLot, Ten, NganhHoc, QueQuan;
	public int NgayS, ThangS, NamS;
	ArrayList_SV(){
		MSSV = HoLot = Ten = NganhHoc = QueQuan = null;
		NgayS = ThangS = NamS = 0;
	}
	ArrayList_SV(String MS, String HL, String T, int NgS, int ThS, int NS, String NH, String QQ){
		MSSV = MS; HoLot = HL; Ten = T; NgayS = NgS; ThangS = ThS; NamS = NS; NganhHoc = NH; QueQuan = QQ;
	}
	public String toString() {
		return "\n1. MSSV: " + MSSV +
				"\n2. Ho va ten: " + HoLot + " " + Ten +
				"\n3. Ngay sinh: " + NgayS + "-" + ThangS + "-" + NamS +
				"\n4. Nganh hoc: " + NganhHoc +
				"\n5. Que quan: " + QueQuan + "\n";
	}
	public void ShowMenu() {
		System.out.println("----- MENU -----"
				+ "\n1. In ra thong tin sinh vien thu k trong danh sach."
				+ "\n2. In ra thong tin tat ca sinh vien ma que quan thuoc tinh thanh NSD nhap vao."
				+ "\n3. In danh sach sinh vien theo thu tu ten tang dan(hoac giam dan)."
				+ "\n4. In danh sach sinh vien theo thu tu ho lot giam dan(hoac tang dan)."
				+ "\n5. In ra danh sach sinh vien sinh vao ngay d thang m."
				+ "\n6. In ra danh sach sinh vien theo thu tu ngay sinh(theo nam/thang/ngay)."
				+ "\n7. In ra cac sinh vien co khuon dang ten vua nhap."
				+ "\n8. In ra cac sinh vien co ma so ma cac ki tu cuoi trung voi khuon dang vua nhap."
				+ "\n9. Doi ten nganh hoc cua cac sinh vien dang hoc nganh N sang ten moi M(luu tru lai vao tap tin)."
				+ "\n10. Trao vi tri cua hai sinh vien i va j(luu tru lai tap tin)."
				+ "\n11. Xoa tat ca sinh vien theo nganh hoc N(luu tru lai tap tin)."
				+ "\n12. Ket thuc chuong trinh.\n");
	}
	public void FillData(String[] s, ArrayList<ArrayList_SV> SV) {
		String mssv = s[0], holot = s[1], ten = s[2] ;
		String[] tokens = s[3].split("-");
		int ngay = Integer.valueOf(tokens[0]), thang = Integer.valueOf(tokens[1]), nam = Integer.valueOf(tokens[2]);
		String nganh = s[4], que = s[5];
		SV.add(new ArrayList_SV(mssv, holot, ten, ngay, thang, nam, nganh, que));
	}
	public int ReadData(String fname, ArrayList<ArrayList_SV> SV) {
		int soluong = 0;
		File f = new File(fname);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String st;
			while((st = br.readLine()) != null) {
				String[] tokens = st.split(",");
				soluong++;
				FillData(tokens, SV);
			}
		}
		catch(Exception e) {
			System.out.println("Loi tap tin!");
		}
		return soluong;
	}
	public void WriteData(String fname, String str) {
		File f = new File(fname);
		try {
			// tao mot cai FileWriter de dung no ghi vao file
            // them true o constructor de viet them vao,
            // khong them hoac them false no se xoa sach file roi moi ghi vao
			FileWriter fWriter = new FileWriter(f, true);
            fWriter.write(str);
            fWriter.close();
		}
		catch(Exception e) {
			System.out.println("Loi ghi tap tin!");
		}
	}
	public void DeleteData(String fname) {
		File f = new File(fname);
		try {
			FileWriter fWriter = new FileWriter(f, false);
            fWriter.write("");
            fWriter.close();
		}
		catch(Exception e) {
			System.out.println("Loi ghi tap tin!");
		}
	}
	


}
