package BaiTap4;
import java.util.*;


public class Main {
	public final static int max = 50;
	public static void main(String[] args) {
		int n, m, t, d, c;
		Integer[][] a = new Integer[max][max];
		Integer[] b = new Integer[max];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong: ");
		n = sc.nextInt();
		System.out.println("Nhap so cot: ");
		m = sc.nextInt();
		a = MaTran.NhapMaTran(n, m);
		MaTran.XuatMaTran(a, n, m);
		do {
			MaTran.ShowMenu();
			System.out.println("Chon so thu tu lenh ma ban muon thuc hien: ");
			t = sc.nextInt();
			switch(t) {
			case 1:
				b = MaTran.TongTungDong(a, n, m);
				for(int i = 0; i < b.length; i++)
					System.out.println("Tong cac phan tu tren dong " + i + " la: " + b[i] + "\n");
				break;
			case 2:
				
				b = MaTran.TongTungCot(a, n, m);
				for(int i = 0; i < b.length; i++)
					System.out.println("Tong cac phan tu tren cot " + i + " la: " + b[i] + "\n");
				break;
			case 3:
				System.out.println("Chi so dong co tong lon nhat la: " + MaTran.ChiSoDongMaxTong(a, n, m));
				break;
			case 4:
				System.out.println("Chi so cot co tong nho nhat la: " + MaTran.ChiSoCotMinTong(a, n, m));
				break;
			case 5:
				b = MaTran.TongTungDong(a, n, m);
				System.out.println("Nhap chi so dong: ");
				d = sc.nextInt();
				System.out.println("Tong cua dong " + d + " la: " + b[d] + "\nGTNN cua dong " + d + " la: " + MaTran.GTNN_Dong(a, m, d));
				break;
			case 6:
				b = MaTran.TongTungCot(a, n, m);
				System.out.println("Nhap chi so cot: ");
				c = sc.nextInt();
				System.out.println("Tong cua cot " + c + " la: " + b[c] + "\nGTLN cua cot " + c + " la: " + MaTran.GTLN_Cot(a, n, c));
				break;
			case 7:
				System.out.println("Goodbye!!!!!");
				break;
			default:
				System.out.println("So thu tu lenh khong hop le, vui long thu lai!!!");
				break;
			}
		}while(t != 7);
	}

}
