package BaiTap3;

import java.util.Scanner;

public class Poin2D implements Movable {
	private double x, y;
	public Poin2D() {}
	public Poin2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	

	@Override
	public void moveUp() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double a;
		System.out.println("\n----- DIEM -----\n");
		do {
			System.out.println("Nhap tung do: ");
			a = s.nextDouble();
			if(a > this.y) {
				System.out.printf("Diem (%s, %s) da di chuyen len vi tri (%s, %s)\n", this.x, this.y, this.x, a);
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
		System.out.println("\n----- DIEM -----\n");
		do {
			System.out.println("Nhap tung do: ");
			a = s.nextDouble();
			if(a < this.y) {
				System.out.printf("Diem (%s, %s) da di chuyen xuong vi tri (%s, %s)\n", this.x, this.y, this.x, a);
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
		System.out.println("\n----- DIEM -----\n");
		do {
			System.out.println("Nhap hoanh do: ");
			a = s.nextDouble();
			if(a < this.x) {
				System.out.printf("Diem (%s, %s) da di chuyen sang trai den vi tri (%s, %s)\n", this.x, this.y, this.x, a);
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
		System.out.println("\n----- DIEM -----\n");
		do {
			System.out.println("Nhap hoanh do: ");
			a = s.nextDouble();
			if(a > this.x) {
				System.out.printf("Diem (%s, %s) da di chuyen sang phai den vi tri (%s, %s)\n", this.x, this.y, this.x, a);
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
	

}
