package HinhHoc_DaHinh;

public class HinhEllipse extends HinhDoiXung {
    double a, b;
    HinhEllipse(){super(); a = b = 0;}
    HinhEllipse(Diem Tam, double bkl, double bkn){
    	TamDoiXung = Tam; a = bkl; b = bkn;
    }
	long ViTriDiem(Diem P) {
		double x = (Math.pow(P.X, 2) / Math.pow(a, 2)) + (Math.pow(P.Y, 2) / Math.pow(b, 2));
		if(x < 1)
			return -1;
		else
			if(x == 1)
				return 0;
			else
				return 1;
	}
	public double DienTich() {
		return PI * a * b;
	}
	public double ChuVi() {
		return 2 * PI * Math.sqrt((a * a + b * b) / 2);
	}
    public String toString(){
    	return "Hinh Ellipse\n" + super.toString() + "\nChu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
    }
}
