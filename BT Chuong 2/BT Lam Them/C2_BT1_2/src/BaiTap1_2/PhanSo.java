package BaiTap1_2;

public class PhanSo {
	private int tuSo, mauSo;
	private static int soLuong = 0;;
	public PhanSo() {
		this.tuSo = 0;
		this.mauSo = 1;
	}
	public PhanSo(int tu, int mau) {
		this.tuSo = tu;
		this.mauSo = mau;
	}
	public static int UCLN(int a, int b) {
		while(a != b)
			if(a > b)
				a -= b;
			else
				b -= a;
		return a;
	}
	public PhanSo rutGon() {
		PhanSo p = new PhanSo();
		p.tuSo = this.tuSo / this.UCLN(Math.abs(tuSo), Math.abs(mauSo));
		p.mauSo = this.mauSo / this.UCLN(Math.abs(tuSo), Math.abs(mauSo));
		return p;
	}
	public PhanSo congPS(PhanSo p) {
		PhanSo q = new PhanSo();
		q.tuSo = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
		q.mauSo = this.mauSo * p.mauSo;
		//q.rutGon();
		return q;
	}
	public PhanSo truPS(PhanSo p) {
		PhanSo q = new PhanSo();
		q.tuSo = this.tuSo * p.mauSo - this.mauSo * p.tuSo;
		q.mauSo = this.mauSo * p.mauSo;
		q.rutGon();
		return q;
	}
	public PhanSo nhanPS(PhanSo p) {
		PhanSo q = new PhanSo();
		q.tuSo = this.tuSo * p.tuSo;
		q.mauSo = this.mauSo * p.mauSo;
		q.rutGon();
		return q;
	}
	public PhanSo chiaPS(PhanSo p) {
		PhanSo q = new PhanSo();
		q.tuSo = this.tuSo * p.mauSo;
		q.mauSo = this.mauSo * p.tuSo;
		q.rutGon();
		return q;
	}
	public byte soSanh(PhanSo p) {
		if(this.tuSo * p.mauSo > this.mauSo * p.tuSo)
			return 1;
		else
			if(this.tuSo * p.mauSo < this.mauSo * p.tuSo)
				return -1;
			else
				return 0;
	}
	public int getTuSo() {return this.tuSo;}
	public int getMauSo() {return this.mauSo;}
	public void setTuSo(int ts) {this.tuSo = ts;}
	public void setMauSo(int ms) {this.mauSo = ms;}
	public static int getSoLuong() {return soLuong;}
	public static void setSoLuong(int sl) {soLuong = sl;}
	public void hienThi() {
		System.out.println(this.tuSo + "/" + this.mauSo);
	}
	
	
	

}
