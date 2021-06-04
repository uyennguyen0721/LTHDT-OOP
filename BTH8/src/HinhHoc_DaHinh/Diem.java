package HinhHoc_DaHinh;

public class Diem {
	  public double X;
	  public double Y;
	  public Diem() {X = Y = 0;}
	  public Diem(double x, double y){X = x;Y = y;}
	  public Diem (Diem p){X = p.X; Y = p.Y;}
	  public static double Dist(Diem p1, Diem p2){ 
		  return Math.sqrt((p1.X - p2.X) * (p1.X - p2.X) + (p1.Y - p2.Y) * (p1.Y - p2.Y));
	  }
	  public double Dist(Diem p){ 
		  return Math.sqrt((this.X - p.X) * (this.X - p.X) + (this.Y - p.Y) * (this.Y - p.Y));
	  }
	  public String toString(){ 
		  return "Dinh co toa do (" + X + "," + Y + ")";
	  }
	}
