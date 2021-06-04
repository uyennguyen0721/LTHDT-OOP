package HinhHoc_DaHinh;
import java.util.ArrayList;

public class TuGiac extends DaGiac {
	TuGiac(){
		super(); SoDinh = 4; DSDinh.add(new Diem()); DSDinh.add(new Diem()); DSDinh.add(new Diem()); DSDinh.add(new Diem());
    }
    TuGiac(Diem A, Diem B, Diem C, Diem D){
        SoDinh = 4;
        DSDinh.add(A);
        DSDinh.add(B);
        DSDinh.add(C);
        DSDinh.add(D);
    }
    TuGiac(ArrayList<Diem> ds){super(ds);}	
    public double ChuVi(){
    	double cv = 0;
        for(int i = 0; i < SoDinh - 1; i++)cv += DSDinh.get(i).Dist(DSDinh.get(i + 1));
        cv += DSDinh.get(0).Dist(DSDinh.get(SoDinh - 1));
        return cv;
    }
    public double DienTich()
    {
    	TamGiac tg1 = new TamGiac(DSDinh.get(0), DSDinh.get(1), DSDinh.get(2));
    	TamGiac tg2 = new TamGiac(DSDinh.get(0), DSDinh.get(2), DSDinh.get(3));
    	return tg1.DienTich() + tg2.DienTich();
    }
    public String toString() {
		String s = "Tu Giac co 4 dinh\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}
    
}
