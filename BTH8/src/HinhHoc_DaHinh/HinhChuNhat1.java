package HinhHoc_DaHinh;

public class HinhChuNhat1 extends TuGiacDoiXung1 {
	double CD = 0, CR = 0;
	public HinhChuNhat1() {super();}
	public HinhChuNhat1(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
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
	public double ChuVi() {
		return (CD + CR) * 2;
	}
	public double DienTich() {
		return CD * CR;
	}
	public String toString() {
		String s = "Hinh Chu Nhat co tam O( " + TamDX + ")\n";
		s += "Chieu dai = " + CD + ", Chieu rong = " + CR + "\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}

}
