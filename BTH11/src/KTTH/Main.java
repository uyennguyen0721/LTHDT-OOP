package KTTH;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<CONGDAN> ds = new ArrayList<>();
		
		//Khoi tao cac doi tuong
		CONGDAN gv1 = new GIANGVIEN("Hoa", "123", 1982, "Ke toan-Kiem toan", "Tien si", null, "0123456781");
		CONGDAN gv2 = new GIANGVIEN("Hang", "323", 1985, "Cong Nghe Thong Tin`", "Thac si", null, "0123456782");
		CONGDAN gv3 = new GIANGVIEN("Hung", "523", 1989, "Cong Nghe Thong Tin", "Tien si", "GS", "0123456783");
		CONGDAN sv1 = new SINHVIEN("Lan", "111", 2000, 2,  "Cong Nghe Thong Tin", "01234324312");
		CONGDAN sv2 = new SINHVIEN("Mai", "112", 2000, 2,  "Cong Nghe Thong Tin", "012343243111");
		CONGDAN cd = new CONGDAN("Lan", "111", 2000);
		
		//Them cac doi tuong vao danh sach
		ds.add(gv1); ds.add(gv2); ds.add(gv3);
		ds.add(sv1); ds.add(sv2); ds.add(cd);
		
		//Liet ke thong tin tung doi tuong
		System.out.println("\n--- DANH SACH ---\n");
		for(CONGDAN d: ds)
			System.out.println(d.toString() + "\n");
		
		//Sap xep danh sach theo thu tu giam dan
		System.out.println("\n--- SAP XEP ---\n");
		ds.sort((CONGDAN cd1, CONGDAN cd2) -> {
			return cd1.getNamSinh() > cd2.getNamSinh() ? -1 : (cd1.getNamSinh() < cd2. getNamSinh() ? 1 : 0);
		});
		for(CONGDAN d: ds)
			System.out.println(d.toString() + "\n");
		
		//Xoa mot cong dan vi du o vi tri thu 2 trong danh sach
		System.out.println("\n--- XOA MOT CONG DAN ---\n");
		ds.remove(2);
		System.out.println("Xoa thanh cong!");
		
		//Them vao mot sinh vien khoa cong nghe thong tin
		System.out.println("\n--- THEM MOT SINH VIEN KHOA CNTT ---\n");
		CONGDAN sv3 = new SINHVIEN("Trang", "212", 2000, 2,  "Cong Nghe Thong Tin", "012343243112");
		ds.add(sv3);
		System.out.println("Them sinh vien thanh cong!");
		
		//Liet ke cac giang vien khoa CNTT hoac cac sinh vien khoa CNTT
		System.out.println("\n--- LIET KE CAC GIANG VIEN HOAC SINH VIEN KHOA CNTT ---\n");
		for(CONGDAN p: ds) {
			if(p instanceof GIANGVIEN)
				if(((GIANGVIEN) p).getKhoa() == "Cong Nghe Thong Tin")
					System.out.println(p.toString());
			if(p instanceof SINHVIEN)
				if(((SINHVIEN) p).getKhoa() == "Cong Nghe Thong Tin")
					System.out.println(p.toString());
		}
		
		
		//Liet ke cac giang vien co hoc vi Tien Si
		System.out.println("\n--- LIET KE CAC GIANG VIEN CO HOC VI TIEN SI ---\n");
		for(CONGDAN p: ds)
			if(p instanceof GIANGVIEN)
				if(((GIANGVIEN) p).getHocVi() == "Tien si")
					System.out.println(p.toString());
		
		//Liet ke cac giang vien co hoc ham la PGS/GS
		System.out.println("\n--- LIET KE CAC GIANG VIEN CO HOC HAM PGS/GS ---\n");
		for(CONGDAN p: ds)
			if(p instanceof GIANGVIEN)
				if(((GIANGVIEN) p).getHocHam() == "PGS" || ((GIANGVIEN) p).getHocHam() == "GS")
					System.out.println(p.toString());
	}
}
