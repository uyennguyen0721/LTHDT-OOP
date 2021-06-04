package HinhHoc_DaHinh;

public class HinhChuNhat extends TuGiacDoiXung {
	double CD = 0, CR = 0;
	public HinhChuNhat() {super();}
	public HinhChuNhat(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
		super(Tam, A, B, C, D);
		CD = A.Dist(B);
		CR = A.Dist(D);
	}

	@Override
	double ChieuDaiDuongCheo1() {
		return Math.sqrt(Math.pow(CD, 2) + Math.pow(CR, 2));
	}

	@Override
	double ChieuDaiDuongCheo2() {
		return ChieuDaiDuongCheo1();
	}

	@Override
	public double DienTich() {
		return CD * CR;
	}

	@Override
	public double ChuVi() {
		return (CD + CR) * 2;
	}
	@Override
	long ViTriDiem(Diem P) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString() {
		String s = "Hinh Chu Nhat co tam O( " + TamDoiXung + ")\n";
		s += "Chieu dai = " + CD + ", Chieu rong = " + CR + "\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}
	

}
