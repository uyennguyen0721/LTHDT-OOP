package BaiTap1;


public class Main {
	public static void main(String[] args) {
		QLHinh ql = new QLHinh();
		Hinh h1 = new HinhChuNhat(3, 4);
		Hinh h2 = new HinhVuong(4);
		Hinh h3 = new Ellipse(4, 3);
		Hinh h4 = new HinhTron(2);
		Hinh h5 = new TamGiac(3, 4, 5);
		Hinh h6 = new TamGiacCan(4, 5);
		Hinh h7 = new TamGiacDeu(3);
		
		//Them hinh vao danh sach
		ql.themHinh(h1); ql.themHinh(h2); ql.themHinh(h3); ql.themHinh(h4); ql.themHinh(h5); ql.themHinh(h6); ql.themHinh(h7);
		
		//Xoa hinh khoi danh sach
		ql.xoaHinh("Tam giac");
		
		//Hien thi thong tin danh danh sach
		System.out.println("\n---- THONG TIN DANH SACH -----\n");
		ql.hienThi();
		
		//Lay danh sach cua mot hinh cu the
		System.out.println("\n----- LAY DANH SACH CAC HINH CUA MOT LOAI CU THE -----\n");
		ql.layDsLoai("Hinh vuong");
		
		//Sap xep danh sach giam dan theo dien tich
		System.out.println("\n----- SAP XEP DS GIAM THEO DIEN TICH -----\n");
		ql.sapXepGiam();
		ql.hienThi();
		
		//Sap xep danh sach giam dan theo dien tich
		System.out.println("\n----- SAP XEP DS GIAM THEO DIEN TICH -----\n");
		ql.sapXepGiam();
		ql.hienThi();
		
		
	}

}
