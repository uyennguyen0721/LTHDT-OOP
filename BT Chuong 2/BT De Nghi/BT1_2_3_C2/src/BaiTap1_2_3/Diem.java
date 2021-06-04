package BaiTap1_2_3;

public class Diem {
	private double X;
	private double Y;
	public Diem() {X = Y = 0;}
	public Diem(double x, double y) {X = x; Y = y;}
	public Diem(Diem p) {X = p.X; Y = p.Y;}
	public double getX() {return X;}
	public double getY() {return Y;}
	public void setX(double x) {X = x;}
	public void setY(double y) {Y = y;}
	public double Dist(Diem p) {
		return Math.sqrt(Math.pow(this.X - p.X, 2) + Math.pow(this.X - p.X, 2));
	}
	public String toString() {
		return "(" + X + ", " + Y + ")";
	}

}
