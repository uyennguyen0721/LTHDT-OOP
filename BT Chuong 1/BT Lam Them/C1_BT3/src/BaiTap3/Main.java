package BaiTap3;
import java.util.Scanner;

public class Main {
	public final static int MAX = 50;
	public static void main(String[] args) {
		Integer[][] a = new Integer[MAX][MAX];
		int n, t;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap kich thuoc ma tran vuong: ");
			n = sc.nextInt();
			if(n < 5 || n > 100)
				System.out.println("Kich thuoc ma tran khong dung yeu cau, vui long nhap lai!");
		}while(n < 5 || n > 100);
		do {
			MaTranVuong.ShowMenu();
			do {
				System.out.println("Nhap so thu tu lenh ma ban chon: ");
				t = sc.nextInt();
				if(t < 1 || t > 5)
					System.out.println("Lenh ma ban chon khong ton tai, vui long chon lai!");
			}while(t < 1 || t > 5);
			switch(t) {
			case 1:
				a = MaTranVuong.NhapMaTran(n);
				System.out.println("Nhap ma tran thanh cong!");
				break;
			case 2:
				MaTranVuong.XuatMaTran(a, n);
				break;
			case 3:
				System.out.println("Tong cac phan tu tren duong bien cua ma tran: " + MaTranVuong.TongPTBien(a, n));
				break;
			case 4:
				MaTranVuong.TimNgToCheoChinh(a, n);
				break;
			case 5:
				System.out.println("Goodbye!!!!!");
				break;
			}
		}while(t != 5);
		
		
	}

}
