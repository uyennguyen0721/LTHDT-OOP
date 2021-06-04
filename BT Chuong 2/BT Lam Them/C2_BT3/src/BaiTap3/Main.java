package BaiTap3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		CauHoi c1 = new CauHoi("I am ... engineer.");
		PhuongAn p1 = new PhuongAn("a", false);
		PhuongAn p2 = new PhuongAn("an", true);
		PhuongAn p3 = new PhuongAn("the", false);
		PhuongAn p4 = new PhuongAn("it", false);
		
		c1.themPhuongAn(p1);
		c1.themPhuongAn(p2);
		c1.themPhuongAn(p3);
		c1.themPhuongAn(p4);
		
		CauHoi c2 = new CauHoi("I wish he  ... an teacher.");
		PhuongAn p5 = new PhuongAn("am", false);
		PhuongAn p6 = new PhuongAn("are", false);
		PhuongAn p7 = new PhuongAn("is", true);
		PhuongAn p8 = new PhuongAn("were", false);
		
		c2.themPhuongAn(p5);
		c2.themPhuongAn(p6);
		c2.themPhuongAn(p7);
		c2.themPhuongAn(p8);
		
		QLCauHoi ql = new QLCauHoi();
		ql.themCauHoi(c1);
		ql.themCauHoi(c2);
		
		Scanner scanner = new Scanner(System.in);
		ql.themCauHoi(scanner);
		
		ql.luyenTap(scanner);
	}

}
