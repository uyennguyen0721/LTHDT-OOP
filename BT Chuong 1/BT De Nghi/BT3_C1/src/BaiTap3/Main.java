package BaiTap3;
import java.util.*;

public class Main {
	public final static int max = 50;
	public static void main(String[] args) {
		int n, t;
		Integer[] a = new Integer[max];
		Scanner sc = new Scanner(System.in);
		do {
			Mang.ShowMenu();
			System.out.println("Chon so thu tu lenh ma ban muon thuc hien: ");
			t = sc.nextInt();
			switch(t) {
			case 1:
				System.out.println("Nhap so luong phan tu cua mang: ");
				n = sc.nextInt();
				a = Mang.NhapMang(n);
				break;
			case 2:
				System.out.println("Tong cac so nguyen to trong mang: " + Mang.TongNguyenTo(a));
				break;
			case 3:
				if(Mang.MaxNguyenTo(a) == Integer.MIN_VALUE)
					System.out.println("Mang khong chua nguyen to!");
				else
					System.out.println("So nguyen to lon nhat: " + Mang.MaxNguyenTo(a));
				break;
			case 4:
				if(Mang.MaxDuong(a) == 0 && Mang.MinAm(a) == 0)
					System.out.println("*");
				else {
					if(Mang.MaxDuong(a) != 0)
						System.out.println("So duong lon nhat trong mang: " + Mang.MaxDuong(a));
					if(Mang.MinAm(a) != 0)
						System.out.println("So am nho nhat trong mang: " + Mang.MinAm(a));
				}
				break;
			case 5:
				Mang.SapXep(a);
				System.out.println("Mang sau khi da sap xep giam dan:\n");
				for(int i = 0; i < a.length; i++)
					System.out.println(a[i] + "\t");
				break;
			case 6:
				System.out.println("Goodbye!!!!!");
				break;
			default:
				System.out.println("So thu tu lenh khong hop le, vui long thu lai!!!");
				break;
			}
		}while(t != 6);
		
	}

}
