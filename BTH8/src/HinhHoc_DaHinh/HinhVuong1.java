package HinhHoc_DaHinh;

public class HinhVuong1 extends HinhThoi1 {
	public HinhVuong1() {super();}
	public HinhVuong1(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
		super(Tam, A, B, C, D);
	}
	public double ChuVi() {
		return Canh * 4;
	}
	public double DienTich() {
		return Math.pow(Canh, 2);
	}
	public double ChieuDaiDuongCheo() {
		return super.ChieuDaiDuongCheo1();
	}
	public String toString() {
		String s = "Hinh Vuong co tam O( " + TamDX + ")\n";
		s += "Canh = " + Canh + "\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}

}
