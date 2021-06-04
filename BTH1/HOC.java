package hoctap;
import java.util.Scanner;
public class HOC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("Nhap he so  a = ");

       double a = s.nextDouble();
       System.out.println("Nhap he so  b = ");
       double b = s.nextDouble();
       System.out.println("Nhap he so  c = ");
       float c = s.nextFloat();
       s.close();
	    
       if (a == 0) {
           if (b == 0) {
               System.out.println("Phuong trinh vo nghiem!");
           } else {
               System.out.println("Phuong trinh co mot nghiem: "
                       + "x = " + (-c / b));
           }
           return;
       }
       double delta = b*b - 4*a*c;
       double x1;
       double x2;
 
       if (delta > 0) {
           x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
           x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
           System.out.println("Phuong trinh co hai nghiem la†: "
                   + "x1 = " + x1 + " v√† x2 = " + x2);
       } else if (delta == 0) {
           x1 = (-b / (2 * a));
           System.out.println("Phuong trinh co nghiem kep: "
                   + "x1 = x2 = " + x1);
       } else {
           System.out.println("Phuong trinh vo nghiem!");
       }
       return;
   }
}

