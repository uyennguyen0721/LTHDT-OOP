package BaiTap3;

import java.util.Scanner;

public class Circle implements Movable {
	private double x, y, r;
	public Circle() {}
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public void moveUp() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double a;
		System.out.println("\n----- HINH TRON -----\n");
		do {
			System.out.println("Nhap tung do: ");
			a = s.nextDouble();
			if(a > this.y) {
				System.out.printf("Hinh tron (%s, %s, %s) da di chuyen len vi tri (%s, %s, %s)\n", this.x, this.y, this.r, this.x, a, this.r);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(a < this.y);
		
	}

	@Override
	public void moveDown() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double a;
		System.out.println("\n----- HINH TRON -----\n");
		do {
			System.out.println("Nhap tung do: ");
			a = s.nextDouble();
			if(a < this.y) {
				System.out.printf("Hinh tron (%s, %s, %s) da di chuyen len vi tri (%s, %s, %s)\n", this.x, this.y, this.r, this.x, a, this.r);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(a > this.y);
		
	}

	@Override
	public void moveLeft() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double a;
		System.out.println("\n----- HINH TRON -----\n");
		do {
			System.out.println("Nhap hoanh do: ");
			a = s.nextDouble();
			if(a < this.x) {
				System.out.printf("Hinh tron (%s, %s, %s) da di chuyen len vi tri (%s, %s, %s)\n", this.x, this.y, this.r, this.x, a, this.r);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(a > this.x);
		
	}

	@Override
	public void moveRight() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double a;
		System.out.println("\n----- HINH TRON -----\n");
		do {
			System.out.println("Nhap hoanh do: ");
			a = s.nextDouble();
			if(a > this.x) {
				System.out.printf("Hinh tron (%s, %s, %s) da di chuyen len vi tri (%s, %s, %s)\n", this.x, this.y, this.r, this.x, a, this.r);
				break;
			}
			else
				System.out.println("Vi tri di chuyen khong hop le, vui long thu lai!\n");
			
		}while(a < this.x);
		
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

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
