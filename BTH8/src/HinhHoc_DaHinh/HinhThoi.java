package HinhHoc_DaHinh;

public class HinhThoi extends TuGiacDoiXung {
	double Canh = 0;
	public HinhThoi() {super();}
	public HinhThoi(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
		super(Tam, A, B, C, D);
		Canh = A.Dist(B);
	}

	@Override
	double ChieuDaiDuongCheo1() {
		return 2 * TamDoiXung.Dist(A);
	}

	@Override
	double ChieuDaiDuongCheo2() {
		return 2 * TamDoiXung.Dist(B);
	}

	@Override
	long ViTriDiem(Diem P) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double DienTich() {
		return (ChieuDaiDuongCheo1() * ChieuDaiDuongCheo2()) / 2;
	}

	@Override
	public double ChuVi() {
		return Canh * 4;
	}
	public String toString() {
		String s = "Hinh Thoi co tam O( " + TamDoiXung + ")\n";
		s += "Canh = " + Canh + ", Duong Cheo 1 = " + ChieuDaiDuongCheo1() + ", Duong Cheo 2 = " + ChieuDaiDuongCheo2() + "\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}

}
