package BaiTap2;
import java.util.Date;

public class GvThinhGiang extends GiangVien {
	private String noiCongTac;
	public GvThinhGiang() {
		super();
	}
	public GvThinhGiang(String ht, Date ns, String hh, String hv, Date ngayBd, String noiCT) {
		super(ht, ns, hh, hv, ngayBd);
		this.noiCongTac = noiCT;
	}
	

	@Override
	public String toString() {
		return super.toString() + "\nNoi cong tac: " + this.noiCongTac;
	}
	@Override
	public double tinhTienLuong(float soGio) {
		return soGio * 90000;
	}


	public String getNoiCongTac() {
		return noiCongTac;
	}


	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}

}
