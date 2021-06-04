package BaiTap2;

public class Main {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat(3, 4);
		HinhVuong hv = new HinhVuong(4);
		TamGiac tg = new TamGiac(3, 4, 5);
		TamGiacCan tgc = new TamGiacCan(3,4);
		TamGiacDeu tgd = new TamGiacDeu(5);
		System.out.println(hcn.toString() + "\n" + hv.toString() + "\n" + tg.toString() + "\n" + tgc.toString() + "\n" + tgd.toString());
	}

}
