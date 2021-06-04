package BaiTap1;

public class Circle extends Ellipse {
	public Circle(double bk) {
		super(bk, bk);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh Circle\nDien tich: " + super.tinhDienTich() + "\nChu vi: " + super.tinhChuVi(); 
	}
	

}
