package BaiTap4;
import java.text.*;
import java.util.*;
import java.util.stream.DoubleStream;

public class HocVien {
	private final int SO_MON_HOC = 3;
	private static int dem = 0;
	private int maSo = ++dem;
	private String hoTen;
	private String queQuan;
	private Date ngaySinh;
	private double[] diem;
	public HocVien(String ht, String qq, Date ns) {
		this.hoTen = ht;
		this.queQuan = qq;
		this.ngaySinh = ns;
		this.diem = null;
	}
	public HocVien() {}
	public void nhapHocVien(Scanner scanner) {
		System.out.println("Nhap ho ten: ");
		this.hoTen = scanner.nextLine();
		System.out.println("Nhap que quan: ");
		this.queQuan = scanner.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String ns = scanner.nextLine();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngaySinh = f.parse(ns);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getMaSo() {return this.maSo;}
	public String getHoTen() {return this.hoTen;}
	public String getQueQuan() {return this.queQuan;}
	public void hienThi() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		System.out.printf("Ma hoc vien: %s\nHo ten: %s\nQue quan: %s\nNgay sinh: %s\n",
				this.maSo, this.hoTen, this.queQuan, f.format(ngaySinh));
		if(this.diem != null) {
			System.out.println("Diem cac mon hoc: ");
			for(double d: this.diem)
				System.out.printf("%.2f\t", d);
			System.out.println("Diem trung binh: " + this.tinhTrungBinh());
		}
	}
	public double tinhTrungBinh() {
		return DoubleStream.of(this.diem).average().getAsDouble();
	}
	public void nhapDiem(Scanner scanner) {
		this.diem = new double[SO_MON_HOC];
		for(int i = 0; i < SO_MON_HOC; i++) {
			System.out.printf("Nhap mon thu %d: ", i);
			this.diem[i] = scanner.nextDouble();
		}
	}
	public boolean isHocBong() {
		for(double d: this.diem)
			if(d < 5)
				return false;
		return this.tinhTrungBinh() >= 8;
	}
	

}
