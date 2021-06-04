package BaiTap3;

import java.util.Scanner;

public class MaTranVuong {
	public static Integer[][] NhapMaTran(int n) {
		Integer[][] a = new Integer[n][n];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++) {
				a[i][j] = (int)(Math.random()*8999 +1000);
			}
		return a;
	}
	public static void XuatMaTran(Integer[][] a, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	} 
	public static int TongPTBien(Integer[][] a, int n) {
		int tong = 0;
		for(int i = 0; i < n; i++) {
			if(i == 0 || i == n - 1)
				for(int j = 0; j < n; j++)
					tong += a[i][j];
			if(i != 0 && i != n - 1)
				tong += (a[i][0] + a[i][n - 1]);
		}
		return tong;
	}
	public static boolean KiemTraNguyenTo(int n) {
		int i = 2;
		boolean kq = true;
		if(n < 2)
			kq = false;
		else {
			while(i <= Math.sqrt((double)(n)) && kq) {
				if(n % i == 0)
					kq = false;
				else
					i++;
			}
		}
		return kq;
	}
	public static void TimNgToCheoChinh(Integer[][] a, int n) {
		Integer [] b = new Integer[n];
		int x = 0;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				if(i == j && KiemTraNguyenTo(a[i][i]) == true) {
					b[x] = a[i][j];
					x++;
				}
		if(x != 0) {
			System.out.println("Cac so nguyen to tren duong cheo chinh cua ma tran:\n");
			for(int i = 0; i < b.length; i++) 
				if(b[i] != null)
					System.out.println(b[i]);
				else
					break;
		}
		else
			System.out.println("Khong co nguyen to nao tren duong cheo chinh!");
	}
	public static void ShowMenu() {
		System.out.println("\n----- MENU -----"
				+ "\n1. Sinh ma tran vuong voi gia tri ngau nhien."
				+ "\n2. Xuat ma tran vuong."
				+ "\n3. Tong cac phan tu tren duong bien cua ma tran."
				+ "\n4. Tim cac so nguyen to tren duong cheo chinh cua ma tran."
				+ "\n5. Ket thuc chuong trinh.\n");
	}
}
