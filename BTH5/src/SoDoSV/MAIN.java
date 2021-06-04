package SoDoSV;
import java.util.*;
public class MAIN {
	static final int MAX = 4000;
	public static void main(String[] args) {
		SINHVIEN dssv[] = new SINHVIEN[MAX];
		int n = 0, a = 0, b = 0, slsv = SINHVIEN.ReadData("D:\\SoDoSinhVien.txt", dssv);
		for(int i = 0; i < slsv; i++) {
			dssv[i] = new SINHVIEN();
		}
		String st = new String();
		Scanner s = new Scanner(System.in);
		do {
			SINHVIEN.ShowMenu();
			System.out.println("Nhap vao so thu tu ma ban muon thuc hien: ");
			n = s.nextInt();
			switch(n) {
			case 1:
				System.out.println("Nhap vi tri day ban: ");
				a = s.nextInt();
				System.out.println("Thong tin cac sinh vien o day ban " + a + ": ");
				SINHVIEN.TTSV_DayBan(a, dssv);
				break;
			case 2:
				System.out.println("Nhap vi tri cho ngoi: ");
				a = s.nextInt();
				System.out.println("Thong tin cac sinh vien o cho ngoi " + a + "cua tat ca cac day ban: ");
				SINHVIEN.TTSV_ChoNgoi(a, dssv);;
				break;
			case 3:
				System.out.println("Nhap vi tri cho ngoi: ");
				a = s.nextInt();
				System.out.println("Nhap vi tri day ban: ");
				b = s.nextInt();
				System.out.println("Thong tin cac sinh vien o cho ngoi " + a + " cua day ban " + b + ": ");
				SINHVIEN.TTSV_VT(a, b, dssv);
				break;
			case 4:
				System.out.println("Nhap khuon dang ten ma ban can tim: ");
				st = s.nextLine();
				System.out.println("Thong tin cac sinh vien co khuon dang ten '" + st + "': ");
				SINHVIEN.TTSV_Ten(st, dssv);;
				break;
			case 5:
				System.out.println("Nhap thang sinh cua sinh vien can tim: ");
				a = s.nextInt();
				System.out.println("Thong tin cac sinh vien co thang sinh la " + a + ": ");
				SINHVIEN.TTSV_Thang(a, dssv);;
				break;
			case 6:
				System.out.println("Nhap nganh hoc: ");
				st = s.nextLine();
				System.out.println("Thong tin cac sinh vien hoc nganh " + st + ": ");
				SINHVIEN.TTSV_Nganh(st, dssv);;
				break;
			case 7:
				System.out.println("Nhap que quan: ");
				st = s.nextLine();
				System.out.println("Thong tin cac sinh vien co que quan o " + st + ": ");
				SINHVIEN.TTSV_QueQuan(st, dssv);;
				break;
			case 8:
				System.out.println("Nhap khuon dang dau cua MSSV(chi nhap 3 chu so dau): ");
				st = s.nextLine();
				System.out.println("Thong tin cac sinh vien co khuon dang dau cua MSSV la " + st + ": ");
				SINHVIEN.TTSV_DauMSSV(st, dssv);;
				break;
			case 9:
				System.out.println("Nhap khuon dang cuoi cua MSSV(chi nhap 2 chu so cuoi): ");
				st = s.nextLine();
				System.out.println("Thong tin cac sinh vien co khuon dang cuoi cua MSSV la " + st + ": ");
				SINHVIEN.TTSV_CuoiMSSV(st, dssv);;
				break;
			case 10:
				System.out.println("Nhap so thu tu cua hai sinh vien can doi cho: ");
				a = s.nextInt();
				b = s.nextInt();
				try {
					SINHVIEN.DoiCho_2SV(dssv, a, b);
				}
				catch(Exception e){
					System.out.println("Loi tap tin");
				}
				System.out.println("Thong tin hai sinh vien sau khi da duoc doi cho:\n" + dssv[a] + "\n" + dssv[b]);
				break;
			case 11:
				System.out.println("Cac vi tri co kha nang xay ra tinh huong 'nho cay nguoi khac': ");
				SINHVIEN.PhatHienNhoCay(dssv);
				break;
			case 12:
				System.out.println("Tam biet.....!");
				break;
			default:
				break;
			}
		}while(n >= 1 && n <= 12);
	}

}
