package HinhHoc_DaHinh;
import java.util.ArrayList;

public class TamGiac extends DaGiac {
	double AB = 0, BC = 0, CA = 0;
	TamGiac(){
		super(); SoDinh = 3; DSDinh.add(new Diem()); DSDinh.add(new Diem()); DSDinh.add(new Diem());
	}
	TamGiac(Diem A, Diem B, Diem C){
		SoDinh = 3;
		DSDinh.add(A);
		DSDinh.add(B);
		DSDinh.add(C);
		AB = A.Dist(B);
		BC = B.Dist(C);
		CA = C.Dist(A);
	}
	TamGiac(ArrayList<Diem> ds){super(ds);}	
	public double ChuVi(){
		return AB + BC + CA;
	}
	public double DienTich(){
		double p = (AB + BC + CA) / 2;
		return Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
	}
	public String toString(){
		String rs = super.toString();
		return "Day la 1 tam giac\n" + rs + "\nChu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
	}
}
