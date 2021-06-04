package BaiTap4;
import java.util.*;

public class Main {
	public final static int MAX = 10;
	public static void main(String[] args) {
		Integer[][] a = new Integer[MAX][MAX], b = new Integer[MAX][MAX];
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap kich thuoc cua mang:\nNhap so dong: ");
		n = sc.nextInt();
		System.out.println("Nhap so cot: ");
		m = sc.nextInt();
		a = MaTran.NhapMaTran(n, m);
		System.out.println("Ma tran A:\n");
		MaTran.XuatMaTran(a, n, m);
		b = MaTran.XDMaTran(a, n, m);
		System.out.println("Ma Tran B sau khi duoc xay dung:\n");
		MaTran.XuatMaTran(b, n, m);
		
	}

}
