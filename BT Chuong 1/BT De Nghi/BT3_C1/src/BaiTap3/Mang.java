package BaiTap3;
import java.util.*;
import java.io.*;

public class Mang {
	public static Integer[] NhapMang(int n) {
		Integer[] a = new Integer[n];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = s.nextInt();
		}
		return a;
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
	public static int TongNguyenTo(Integer[] a) {
		int tong = 0;
		for(int i = 0; i < a.length; i++)
			if(KiemTraNguyenTo(a[i]))
				tong += a[i];
		return tong;
	}
	public static int MaxNguyenTo(Integer[] a) {
		int maxNT = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++)
			if(KiemTraNguyenTo(a[i]) && a[i] > maxNT )
				maxNT = a[i];
		return maxNT;
	}
	public static int MaxDuong(Integer[] a) {
		int max = 0;
		for(int i = 0; i < a.length; i++)
			if(a[i] > 0 && a[i] > max)
				max = a[i];
		return max;
	}
	public static int MinAm(Integer[] a) {
		int min = 0;
		for(int i = 0; i < a.length; i++)
			if(a[i] < 0 && a[i] < min)
				min = a[i];
		return min;
	}
	
	public static void SapXep(Integer[] a) {
		Arrays.sort(a, Collections.reverseOrder());
	}
	public static void XuatMang(Integer[] a) {
		for(int k: a)
			System.out.printf("%d\t", k);
		System.out.println();
	}
	public static void ShowMenu() {
		System.out.println("\n----- MENU -----"
				+ "\n1. Nhap mang gom n so nguyen."
				+ "\n2. Tinh tong cac so nguyen to."
				+ "\n3. Tim so nguyen to lon nhat."
				+ "\n4. Tim so duong lon nhat va so am be nhat trong day."
				+ "\n5. Sap xep day giam dan."
				+ "\n6. Ket thuc!!!!\n");
	}

}
