package BaiTap1;

import java.util.ArrayList;

public class QuanLyTaiKhoan {
	private ArrayList<TaiKhoan> dsTaiKhoan = new ArrayList<>();
	public void themtaiKhoan(TaiKhoan tk) {
		dsTaiKhoan.add(tk);
	}
	public TaiKhoan traCuu(String soTk) {
		TaiKhoan tk = new TaiKhoan();
		for(TaiKhoan p: this.dsTaiKhoan)
			if(p.soTaiKhoan.contains(soTk) == true)
				tk = p;
		return tk;	
	}
	public ArrayList<TaiKhoan> traCuu1(String tuKhoa) {
		ArrayList<TaiKhoan> tk = new ArrayList<>();
		for(TaiKhoan p: this.dsTaiKhoan)
			if(p.tenTaiKhoan.contains(tuKhoa) == true)
				tk.add(p);
		return tk;
	}
	public void hienThi() {
		this.dsTaiKhoan.forEach(p -> System.out.println(p.toString() + "\n"));
	}

	public ArrayList<TaiKhoan> getDsTaiKhoan() {
		return dsTaiKhoan;
	}

	public void setDsTaiKhoan(ArrayList<TaiKhoan> dsTaiKhoan) {
		this.dsTaiKhoan = dsTaiKhoan;
	}
	

}
