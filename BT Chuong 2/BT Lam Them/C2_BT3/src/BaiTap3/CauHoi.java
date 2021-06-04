package BaiTap3;

import java.util.*;

public class CauHoi {
	private final String[] lable = {"A", "B", "C", "D"};
	private static int dem = 0;
	private int id;
	private String noiDung;
	private List<PhuongAn> phuongAn;
	{
		id = ++dem;
		phuongAn = new ArrayList<>();
	}
	public CauHoi(String noiDung) {
		this.noiDung = noiDung;
	}
	public CauHoi() {}
	public void nhapCH(Scanner scanner) {
		System.out.println("Noi dung cau hoi: ");
		this.noiDung = scanner.nextLine();
		for(int i = 0; i < lable.length; i++) {
			System.out.printf("Nhap phuong an %s\n", lable[i]);
			PhuongAn pa = new PhuongAn();
			pa.nhapPA(scanner);
			this.phuongAn.add(pa);
		}
	}
	public void themPhuongAn(PhuongAn pa) {
		if(this.phuongAn.size() < lable.length)
			this.phuongAn.add(pa);
	}
	public boolean ktDapAn(String da) {
		da = da.toUpperCase();
		for(int i = 0; i < this.phuongAn.size(); i++) {
			if(this.phuongAn.get(i).isChinhXac() == true && lable[i].equals(da) == true)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = String.format("%s\n", this.noiDung);
		for(int i = 0; i < this.phuongAn.size(); i++)
			s += String.format("%s. %s", lable[i], this.phuongAn.get(i));
//		for(PhuongAn p: this.phuongAn)
//			s += p;
		return s;
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
	public List<PhuongAn> getPhuongAn() {
		return phuongAn;
	}
	public void setPhuongAn(List<PhuongAn> phuongAn) {
		this.phuongAn = phuongAn;
	}
	

}
