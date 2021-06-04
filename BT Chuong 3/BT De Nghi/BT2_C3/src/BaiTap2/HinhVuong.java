package BaiTap2;

public class HinhVuong extends HinhChuNhat {

	public HinhVuong(double canh) {
		super(canh, canh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh vuong\nDien tich: " + super.tinhDienTich() + "\nChu vi: " + super.tinhChuVi();
	}
	
	

}
