package BaiTap3;

import java.util.*;

public class QLCauHoi {
	private List<CauHoi> ds;
	public QLCauHoi() {
		this.ds = new ArrayList<>();
	}
	public void themCauHoi(CauHoi ch) {
		this.ds.add(ch);
	}
	public void themCauHoi(Scanner scanner) {
		CauHoi ch = new CauHoi();
		ch.nhapCH(scanner);
		this.ds.add(ch);
	}
	
	public void luyenTap(Scanner scanner) {
		for(CauHoi c: this.ds) {
			System.out.println(c);
			System.out.print("Tra loi cua ban: ");
			String da = scanner.next();
			if(c.ktDapAn(da) == true)
				System.out.println("CHINH XAC!!!");
			else
				System.out.println("SAI ROI!!!");
		}
	}
	

	public List<CauHoi> getDs() {
		return ds;
	}

	public void setDs(List<CauHoi> ds) {
		this.ds = ds;
	}
}
