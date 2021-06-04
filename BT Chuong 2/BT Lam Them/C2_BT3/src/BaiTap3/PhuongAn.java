package BaiTap3;
import java.util.*;

public class PhuongAn {
	private static int dem = 0;
	private int id;
	private String noiDung;
	private boolean chinhXac;
	{
		id = ++dem;
	}
	public PhuongAn(String noiDung, boolean chinhXac) {
		this.noiDung = noiDung;
		this.chinhXac = chinhXac;
	}
	public PhuongAn() {}
	public void nhapPA(Scanner scanner) {
		System.out.println("Noi dung phuong an: ");
		this.noiDung = scanner.nextLine();
		System.out.print("Dung/Sai (Y/N)");
		String da = scanner.nextLine().toUpperCase();
		this.chinhXac = da.equals("Y");
//		if(da.equals("Y"))
//			this.chinhXac = true;
//		else
//			this.chinhXac = false;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n", this.noiDung);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public boolean isChinhXac() {
		return chinhXac;
	}
	public void setChinhXac(boolean chinhXac) {
		this.chinhXac = chinhXac;
	}
}
