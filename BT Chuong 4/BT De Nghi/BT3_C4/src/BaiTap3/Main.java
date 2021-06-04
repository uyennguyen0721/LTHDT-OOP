package BaiTap3;

public class Main {

	public static void main(String[] args) {
		Poin2D p = new Poin2D(2, 3);
		Rectangle r = new Rectangle(1, 3, 4, 1);
		Circle c = new Circle(2, 2, 2);
		
		// Di chuyen len
		System.out.println("\n=== DI CHUYEN LEN ===\n");
		p.moveUp();
		r.moveUp();
		c.moveUp();
		
		//Di chuyen xuong
		System.out.println("\n=== DI CHUYEN XUONG ===\n");
		p.moveDown();
		r.moveDown();
		c.moveDown();
		
		//Di chuyen sang trai
		System.out.println("\n=== DI CHUYEN SANG TRAI ===\n");
		p.moveLeft();
		r.moveDown();
		c.moveLeft();
		
		//Di chuyen sang phai
		System.out.println("\n=== DI CHUYEN SANG PHAI ===\n");
		p.moveRight();
		r.moveRight();
		c.moveRight();
	}

}
