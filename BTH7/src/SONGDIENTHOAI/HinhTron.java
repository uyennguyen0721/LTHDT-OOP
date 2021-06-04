package SONGDIENTHOAI;

public class HinhTron {
	public static double SOPI = 3.14; 
	protected double x;
	protected double y;
	protected double R;
	public HinhTron() {x = y = R = 0;}
	public HinhTron(double toadoX, double toadoY, double bankinhR)
              {x = toadoX; y = toadoY; setR(bankinhR);}
	public double getR(){return R;};
	public void setR(double bk){R = bk >= 0 ? bk : R;}
	public double getSOPI(){return SOPI;}
	public void setSOPI(double newvalue)
	 {	 if (newvalue > 3.16 || newvalue < 3.14) return;
		 SOPI=newvalue;
     	 return;
	 }
	public double ChuVi(){ return 2*R*SOPI;}
	public double DienTich(){ return R*R*SOPI;}
	public long ViTriVoiDiem(Diem p)
	{
		Diem q = new Diem(x, y);
		double kc= q.Dist(p);
		if (kc == R) return 0;
		else if (kc > R) return 1;
		else return -1;
	}
	public String toString()
	 {
		 String s = "Hinh trong tam O(" + x+ ", " + y + ")\n";
		 s += "R = " + R + "\n";
		 s += "Chu vi = "+ ChuVi() + "  Dien tich = " + DienTich() + " (Pi = " + SOPI + ")\n";
		 return s;
	 }

}
