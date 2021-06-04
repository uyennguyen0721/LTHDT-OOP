package KTTH;

import java.util.ArrayList;

public class SoNguyenTo {
	private int a;
	public SoNguyenTo() {
		a = 0;
	}
	public SoNguyenTo(int x) {
		if(this.isSoNguyenTo(x) == true)
			this.a = x;
		else
			System.out.println(x + " khong phai la so nguyen to, khong luu tru.");
	}
	public int timSoNguyenToTiepTheo() {
		int x = this.a + 1;
		while(this.isSoNguyenTo(a)) {
			if(this.isSoNguyenTo(x))
				break;
			else
				x++;
		}
		return x;
	}
	public boolean isSoNguyenTo(int n) {
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
	public String toString() {
		return String.valueOf(a);
	}

	public int getA() {
		return this.a;
	}

	public void setA(int a) {
		if(this.isSoNguyenTo(a) == true)
			this.a = a;
		else
			System.out.println(a + " khong phai la so nguyen to, khong luu tru.");
	}
	public static void main(String[] args) {
		ArrayList<SoNguyenTo> x = new ArrayList<>();
		x.add(new SoNguyenTo(2));
		int dem = 0;
		System.out.println("100 so nguyen to dau tien la:\n");
		while(dem < 100) {
			int i = x.get(dem).timSoNguyenToTiepTheo();
			x.add(new SoNguyenTo(i));
			dem++;
		}
		for(int i = 0; i < x.size(); i++)
			System.out.printf("%s\t", x.get(i));
	}
	

}
