package HinhHoc_DaHinh;

public abstract class HinhDoiXung extends HinhHoc {
	Diem TamDoiXung;
	abstract long ViTriDiem(Diem P);
	public String toString() {
		return "Tam doi xung la: "+ TamDoiXung.toString();
	}
}
