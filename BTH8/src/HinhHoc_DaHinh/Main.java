package HinhHoc_DaHinh;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Tao mot so doi tuong thuoc cac lop:
		// *Diem
		Diem A = new Diem(1, 2), B = new Diem(4, 5), C = new Diem(2, 4), D = new Diem(1, 5), E = new Diem(1, 3), F = new Diem(4, 2), G = new Diem (4, 3), H = new Diem(5/2, 4), I = new Diem(5/2, 5/2), K = new Diem(3, 1), L = new Diem(4, 4), M = new Diem(2, 2), N = new Diem(3, 3);
		// *Tam giac
		TamGiac TamG1 = new TamGiac(A, B, C), TamG2 = new TamGiac(B, D, E), TamG3 = new TamGiac(B, C, D);
		// *Tu giac
		TuGiac TuG1 = new TuGiac(A, B, C, D), TuG2 = new TuGiac(B, C, D, E);
		// *Hinh Ellipse
		HinhEllipse EL1 = new HinhEllipse(A, 4, 2), EL2 = new HinhEllipse(C, 5, 3), EL3 = new HinhEllipse(E, 3, 2);
		
		//Thu nghiem mot doi tuong ArrayList<DaGiac> và sau do sap xep danh sach theo thu tu dien tich tang dan
		ArrayList<DaGiac> dsDG = new ArrayList<DaGiac>();
		dsDG.add(TamG1); dsDG.add(TamG3); dsDG.add(TuG2);
		dsDG.sort((DaGiac DG1, DaGiac DG2) -> {
			return DG1.DienTich() == DG2.DienTich() ? 0 : (DG1.DienTich() < DG2.DienTich() ? -1 : 1);
		  }
		);
		System.out.println("\nDanh sach cac da giac theo thu tu dien tich tang dan:\n");
		for(int i = 0; i < dsDG.size(); i++) {
			System.out.println(dsDG.get(i));
		}
		
		System.out.println("-----------------------------------------------");
		
		//Thu nghiem mot doi tuong ArrayList<HinhHoc> va sau do sap xep theo thu tu chu vi tang dan
		ArrayList<HinhHoc> dsHH = new ArrayList<HinhHoc>();
		dsHH.add(TamG2); dsHH.add(TuG1); dsHH.add(EL1); dsHH.add(EL2); dsHH.add(EL3);
		dsHH.sort((HinhHoc H1, HinhHoc H2) -> {
			return H1.ChuVi() == H2.ChuVi() ? 0 : (H1.ChuVi() < H2.ChuVi() ? -1 : 1);			
		  }
		);
		System.out.println("\nDanh sach cac da giac theo thu tu chu vi tang dan:\n");
		for(int i = 0; i < dsHH.size(); i++) {
			System.out.println(dsHH.get(i));
		}
		
		System.out.println("-----------------------------------------------");
		
		//Tao mot doi tuong cho moi lop khong truu tuong cuoi cung
		// *1 doi tuong lop TamGiac
		TamGiac TamG = new TamGiac(A, C, E);
		// *1 doi tuong cho lop TuGiac
		TuGiac TuG = new TuGiac(E, C, G, A);
		// *1 doi tuong lop HinhChuNhat
		HinhChuNhat HCN = new HinhChuNhat(H, D, B, G, E);
		// *1 doi tuong lop HinhVuong
		HinhVuong HV = new HinhVuong(I, A, C, G, K);
		// *1 doi tuong lop HinhVuong1
		HinhVuong1 HV1 = new HinhVuong1(N, C, L, F, M);
		
		//Dung 1 doi tuong ArrayList de luu tru cac doi tuong nay
		ArrayList<HinhHoc> DS = new ArrayList<HinhHoc>();
		DS.add(TamG); DS.add(TuG); DS.add(HV); DS.add(HV1); DS.add(HCN);
		
		//Sap xep cac doi tuong theo chu vi giam dan
		DS.sort((HinhHoc H1, HinhHoc H2) -> {
			return H1.ChuVi() == H2.ChuVi() ? 0 : ( H1.ChuVi() > H2.ChuVi() ? -1 : 1);
		  }
		);
		System.out.println("\nDanh sach cac hinh hoc theo thu tu chu vi giam dan:\n");
		for(int i = 0; i < DS.size(); i++) {
			System.out.println(DS.get(i));
		}
		
    }

}
