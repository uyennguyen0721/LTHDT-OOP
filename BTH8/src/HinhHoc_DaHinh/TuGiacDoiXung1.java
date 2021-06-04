package HinhHoc_DaHinh;

public abstract class TuGiacDoiXung1 extends TuGiac {
	public Diem TamDX;
	public TuGiacDoiXung1() {
		super(); TamDX = null;
	}
	public TuGiacDoiXung1(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
		super(A, B, C, D); TamDX = Tam;
	}
	abstract double ChieuDaiDuongCheo1();
	abstract double ChieuDaiDuongCheo2();
	public String toString() {
		String s = "Tu giac có " + DSDinh + "\n";
		s += "Chieu dai duong cheo thu nhat = " + ChieuDaiDuongCheo1() + "\n";
		s += "Chieu dai duong cheo thu hai = " + ChieuDaiDuongCheo2() + "\n";
		return s;
	}

}
