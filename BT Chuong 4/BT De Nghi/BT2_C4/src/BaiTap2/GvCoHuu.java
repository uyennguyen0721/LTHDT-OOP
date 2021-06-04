package BaiTap2;

import java.util.Date;

public class GvCoHuu extends GiangVien {
	private double luongCb;
	private float heSo;
	public GvCoHuu() {
		super();
	}
	public GvCoHuu(String ht, Date ns, String hh, String hv, Date ngayBd, double luongcb, float hs) {
		super(ht, ns, hh, hv, ngayBd);
		this.luongCb = luongcb;
		this.heSo = hs;
	}

	@Override
	public double tinhTienLuong(float soGio) {
		return soGio * 90000 + this.luongCb * this.heSo;
	}
	

	@Override
	public String toString() {
		return super.toString() + "\nLuong can ban: " + this.luongCb + "\nHe so: " + this.heSo;
	}
	public double getLuongCb() {
		return luongCb;
	}

	public void setLuongCb(double luongCb) {
		this.luongCb = luongCb;
	}

	public float getHeSo() {
		return heSo;
	}

	public void setHeSo(float heSo) {
		this.heSo = heSo;
	}

}
