package BaiTap1;
import java.util.*;

public class Main {
	public final static int MAX = 10;
	public static void main(String[] args) {
		int n, x, kq = 0;
		Integer[] a = new Integer[MAX];
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Nhap bac cua da thuc: ");
			n = s.nextInt();
			if(n <= 0)
				System.out.println("Bac cua da thuc khong hop le, vui long nhap lai!");
		}while(n <= 0);
		for(int i = 0; i <= n; i++)
			a[i] = (int)(Math.random()*10 - 5);
		System.out.println("Nhap gia tri cua x: ");
		x = s.nextInt();
		for(int i = 0; i <= n; i++)
			kq += a[i] * Math.pow(x, i);
		String st = "Gia tri cua bieu thuc f(x) = ";
		for(int i = n; i >= 0; i--) {
			if(i != n) {
				if(i == 0) {
					if(a[i] < 0)
						if(a[i] == -1)
							st += " - 1";
						else
							st += (" - " + Math.abs(a[i]));
					else
						if(a[i] > 0)
							if(a[i] == 1)
								st += " + 1";
							else
								st += (" + " + a[i]);
							
				}
				else
					if(i == 1) {
						if(a[i] < 0)
							if(a[i] == -1)
								st += " - x";
							else
								st += (" - " + Math.abs(a[i]) + "x");
						else
							if(a[i] > 0)
								if(a[i] == 1)
									st += " + x";
								else
									st += (" + " + a[i] + "x");
					}
					else {
						if(a[i] < 0)
							if(a[i] == -1)
								st += " - x^" + i;
							else
								st += (" - " + Math.abs(a[i]) + "x^" + i);
						else
							if(a[i] > 0)
								if(a[i] == 1)
									st += " + x^" + i;
								else
									st += (" + " + a[i] + "x^" + i);
					}
					
			}
			else {
				if(a[i] < 0)
					if(a[i] == -1)
						st += " -x^" + i;
					else
						st += (" - " + Math.abs(a[i]) + "x^" + i);
				else
					if(a[i] > 0)
						if(a[i] == 1)
							st += " x^" + i;
						else
							st += (a[i] + "x^" + i);
			}	
		}
		System.out.println(st + " tai x = " + x + " la: f(" + x + ") = " + kq);
			
	}

}
