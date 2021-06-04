package HinhHoc_DaHinh;

public class HinhVanhKhan extends HinhEllipse {
	public HinhVanhKhan() {super();}
	public HinhVanhKhan(Diem O, double R, double r) {super(O, R, r);}
	public double DienTich(){ return (a * a - b * b) * PI;}
	public double ViTriVoiDiem(Diem p) {
		double kq = TamDoiXung.Dist(p);
		if(kq == a || kq == b)
			return 0;
		else
			if(kq > a || kq < b)
				return 1;
			else
				return -1;
	}
	public String toString() {
		String s = "Hinh vanh khan tam O(" + TamDoiXung + ", " + a + ", " + b + ")\n";
		s += "Ban kinh lon R = " + a + ", ban kinh nho r = " + b + "\n";
		s += "Dien tich = " + DienTich() + " ( voi so Pi = " + PI + " )\n";
		return s;
	}

}
