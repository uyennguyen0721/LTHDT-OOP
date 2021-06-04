package HinhHoc_DaHinh;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong() {super();}
	public HinhVuong(Diem Tam, Diem A, Diem B, Diem C, Diem D) {
		super(Tam, A, B, C, D);
	}
	public double ChuVi() {
		return super.ChuVi();
	}
	public double DienTich() {
		return super.DienTich();
	}
	public double ChieuDaiDuongCheo() {
		return super.ChieuDaiDuongCheo1();
	}
	public String toString() {
		String s = "Hinh Vuong co tam O( " + TamDoiXung + ")\n";
		s += "Canh = " + CD + "\n";
		s += "Chu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
		return s;
	}

}
