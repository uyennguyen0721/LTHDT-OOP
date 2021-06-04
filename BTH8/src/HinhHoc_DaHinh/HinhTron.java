package HinhHoc_DaHinh;

public class HinhTron extends HinhEllipse {
	  HinhTron(){super();}
	  HinhTron(Diem O, double bankinh){
	    super(O, bankinh, bankinh);	  
	  }
	  public String toString(){
		  return "Hinh tron:\n" + super.toString() + "\nChu Vi = " + ChuVi() + ", Dien Tich = " + DienTich() + "\n";
	  }
	}
