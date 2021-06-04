package BaiTap2;

public class TamGiacCan extends TamGiac {

	public TamGiacCan(double ab, double c) {
		super(ab, ab, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tam giac can\nDien tich: " + super.tinhDienTich() + "\nChu vi: " + super.tinhChuVi();
	}
	
}
