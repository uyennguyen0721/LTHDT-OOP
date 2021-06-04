package HinhHoc_DaHinh;

public abstract class TuGiacDoiXung extends HinhDoiXung {
	Diem A, B, C, D;
	public TuGiacDoiXung() {
		super.TamDoiXung = A = B = C = null;
	}
	public TuGiacDoiXung(Diem Tam, Diem a, Diem b, Diem c, Diem d) {
		super.TamDoiXung = Tam; A = a; B = b; C = c; D = d;
	}
	abstract double ChieuDaiDuongCheo1();
	abstract double ChieuDaiDuongCheo2();
	public String toString() {
		String s = "Tu giac có " + A + ", " + B + ", " + C + ", " + D + "\n";
		s += "Chieu dai duong cheo thu nhat = " + ChieuDaiDuongCheo1() + "\n";
		s += "Chieu dai duong cheo thu hai = " + ChieuDaiDuongCheo2() + "\n";
		return s;
	}
}
