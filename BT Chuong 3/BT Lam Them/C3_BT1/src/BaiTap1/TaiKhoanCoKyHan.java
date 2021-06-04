package BaiTap1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TaiKhoanCoKyHan extends TaiKhoan {
	private KyHan kyHan;
	private GregorianCalendar ngayDaoHan;
	
	public TaiKhoanCoKyHan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoanCoKyHan(String tenTk, String email, String diaChi, double soTien, KyHan kyHan, GregorianCalendar ngayDaoHan) {
		super(tenTk, email, diaChi, soTien);
		// TODO Auto-generated constructor stub
		this.kyHan = kyHan;
		this.ngayDaoHan = ngayDaoHan;
	}
	
	@Override
	public double tinhTienLai() {
		// TODO Auto-generated method stub
		if(this.kyHan == KyHan.MOT_TUAN)
			return super.soTien * 0.005;
		else
			if(this.kyHan == KyHan.MOT_THANG)
				return super.soTien * 0.045;
		return super.soTien * 0.068;
				
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = super.toString() + "\nKy han: " + this.kyHan;
		return s;
	}
	@Override
	public boolean ktDaoHan() {
		GregorianCalendar c = new GregorianCalendar();
		if(this.ngayDaoHan.get(Calendar.DATE) == c.get(Calendar.DATE) && this.ngayDaoHan.get(Calendar.MONTH) == c.get(Calendar.MONTH) && this.ngayDaoHan.get(Calendar.YEAR) == c.get(Calendar.YEAR))
			return true;
		return false;
		// TODO Auto-generated method stub	
	}
	public void capNhatDaoHan() {
		if(this.ktDaoHan()) {
			this.ngayDaoHan.add(Calendar.DAY_OF_YEAR, this.laySoNgay(this.ngayDaoHan));
		}
	}
	public int laySoNgay(GregorianCalendar d) {
		int soNgay = 0;
		switch(this.kyHan) {
		case MOT_NAM: //Lay so ngay cua nam
			soNgay = d.getActualMaximum(Calendar.DAY_OF_MONTH);
			break;
		case MOT_THANG: //Lay so ngay cua thang
			soNgay = d.getActualMaximum(Calendar.DAY_OF_MONTH);
			break;
		case MOT_TUAN: //Lay so ngay cua tuan
			soNgay = d.getActualMaximum(Calendar.DAY_OF_WEEK);
			break;
		}
		return soNgay;
	}
	public KyHan getKyHan() {
		return kyHan;
	}
	public void setKyHan(KyHan kyHan) {
		this.kyHan = kyHan;
	}
	public GregorianCalendar getNgayDaoHan() {
		return ngayDaoHan;
	}
	public void setNgayDaoHan(GregorianCalendar ngayDaoHan) {
		this.ngayDaoHan = ngayDaoHan;
	}

}
