package BaiTap3;

import java.util.Scanner;

public class Rectangle implements Movable {
	private double x, y, a, b;
	public Rectangle() {}
	public Rectangle(double x, double y, double a, double b) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void moveUp() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double m, n;
		System.out.println("\n----- HINH CHU NHAT -----\n");
		do {
			System.out.println("Nhap y = ");
			m = s.nextDouble();
			System.out.println("Nhap b = ");
			n = s.nextDouble();
			if(m > this.y && n > this.b) {
				System.out.printf("HCN [(%s, %s), (%s, %s)] da di chuyen len vi tri [(%s, %s), (%s, %s)]\n", this.x, this.y, this.a, this.b, this.x, m, this.a, n);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(m < this.y || n < this.b);
		
	}
	@Override
	public void moveDown() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double m, n;
		System.out.println("\n----- HINH CHU NHAT -----\n");
		do {
			System.out.println("Nhap y = ");
			m = s.nextDouble();
			System.out.println("Nhap b = ");
			n = s.nextDouble();
			if(m < this.y && n < this.b) {
				System.out.printf("HCN [(%s, %s), (%s, %s)] da di chuyen xuong vi tri [(%s, %s), (%s, %s)]\n", this.x, this.y, this.a, this.b, this.x, m, this.a, n);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(m > this.y || n > this.b);
		
	}
	@Override
	public void moveLeft() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double m, n;
		System.out.println("\n----- HINH CHU NHAT -----\n");
		do {
			System.out.println("Nhap x = ");
			m = s.nextDouble();
			System.out.println("Nhap a = ");
			n = s.nextDouble();
			if(m < this.x && n < this.a) {
				System.out.printf("HCN [(%s, %s), (%s, %s)] da di chuyen sang trai den vi tri [(%s, %s), (%s, %s)]\n", this.x, this.y, this.a, this.b, this.x, m, this.a, n);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(m > this.y || n > this.b);
		
	}
	@Override
	public void moveRight() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double m, n;
		System.out.println("\n----- HINH CHU NHAT -----\n");
		do {
			System.out.println("Nhap x = ");
			m = s.nextDouble();
			System.out.println("Nhap a = ");
			n = s.nextDouble();
			if(m > this.x && n > this.a) {
				System.out.printf("HCN [(%s, %s), (%s, %s)] da di chuyen sang phai den vi tri [(%s, %s), (%s, %s)]\n", this.x, this.y, this.a, this.b, this.x, m, this.a, n);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(m < this.x || n < this.a);
		
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
