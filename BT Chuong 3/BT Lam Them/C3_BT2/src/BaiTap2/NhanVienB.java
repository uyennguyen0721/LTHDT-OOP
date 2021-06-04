package BaiTap2;

public class NhanVienB extends NhanVien {
	public NhanVienB(String cmnd, String hoTen, String queQuan, String gioiTinh, String dienThoai) {
		super(cmnd, hoTen, queQuan, gioiTinh, dienThoai);
		this.heSo = 1.5;
	}

	public NhanVienB() {
		super();
		this.heSo = 1.5;
	}


}
