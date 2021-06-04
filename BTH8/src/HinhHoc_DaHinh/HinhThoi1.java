package HinhHoc_DaHinh;

public class HinhThoi1 extends TuGiacDoiXung1 {
	double Canh = 0;
	public HinhThoi1() {super();}
	public HinhThoi1(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
		super(Tam, A, B, C, D);
		Canh = A.Dist(B);
	}

	@Override
	double ChieuDaiDuongCheo1() {
		return 2 * TamDX.Dist(DSDinh.get(0));
	}

	@Override
	double ChieuDaiDuongCheo2() {
		return 2 * TamDX.Dist(DSDinh.get(1));
	}
	public double DienTich() {
		return (ChieuDaiDuongCheo1() * ChieuDaiDuongCheo2()) / 2;
	}
	public double ChuVi() {
		return Canh * 4;
	}
	public String toString() {
		String s = "Hinh Thoi co tam O( " + TamDX + ")\n";
		s += "Canh = " + Canh + ", Duong Cheo 1 = " + ChieuDaiDuongCheo1() + ", Duong Cheo 2 = " + ChieuDaiDuongCheo2() + "\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}

}
