package JAVA;
import java.util.Scanner;
public class BAI5 {
	public static void main(String[] args) {
	double R;
	final float pi=3.14f;
	Scanner k=new Scanner(System.in);
	System.out.print("nhap vao ban kinh R:");
	R=k.nextDouble();
	System.out.println("chu vi hinh tron la :"+R*R*pi);
	System.out.println("dien tich hinh tron la :"+2*R*pi);
	}

}
