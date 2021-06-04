package BaiTap4;

import java.util.Scanner;

public class MaTran {
	public static Integer[][] NhapMaTran(int n, int m) {
		Integer[][] a = new Integer[n][m];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++) {
				a[i][j] = (int)(Math.random()*20 +1);
			}
		return a;
	}
	public static void XuatMaTran(Integer[][] a, int n, int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	}
	public static Integer[] TongTungDong(Integer[][] a, int n, int m) {
		Integer[] b = new Integer[n];
		for(int i = 0; i < n; i++) {
			int tong = 0;
			for(int j = 0; j < m; j++)
				tong += a[i][j];
			b[i] = tong;
		}
		return b;
	}
	public static Integer[] TongTungCot(Integer[][] a, int n, int m) {
		Integer[] b = new Integer[m];
		for(int j = 0; j < m; j++) {
			int tong = 0;
			for(int i = 0; i < n; i++)
				tong += a[i][j];
			b[j] = tong;
		}
		return b;
	}
	public static int ChiSoDongMaxTong(Integer[][] a, int n, int m) {
		Integer[] b = TongTungDong(a, n, m);
		int max = 0;
		for(int i = 0; i < b.length; i++)
			if(b[i] > b[max])
				max = i;
		return max;
	}
	public static int ChiSoCotMinTong(Integer[][] a, int n, int m) {
		Integer[] b = TongTungCot(a, n, m);
		int min = 0;
		for(int i = 0; i < b.length; i++)
			if(b[i] < b[min])
				min = i;
		return min;
	}
	public static int GTNN_Dong(Integer[][] a, int m, int d) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < m; i++)
			if(a[d][i] < min)
				min = a[d][i];
		return min;
	}
	public static int GTLN_Cot(Integer[][] a, int n, int c) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++)
			if(a[i][c] > max)
				max = a[i][c];
		return max;
	}
	public static void ShowMenu() {
		System.out.println("\n----- MENU -----"
				+ "\n1. Tinh tong tren tung dong."
				+ "\n2. Tinh tong tren tung cot."
				+ "\n3. Tim chi so dong co tong lon nhat."
				+ "\n4. Tim chi so cot co tong nho nhat."
				+ "\n5. Tinh tong va tim gia tri nho nhat cua dong d."
				+ "\n6. Tinh tong va tim gia tri lon nhat cua cot c."
				+ "\n7. Ket thuc!!!!\n");
	}
	

}
