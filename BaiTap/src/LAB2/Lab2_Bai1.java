package LAB2;

import java.util.*;
public class Lab2_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = sc.nextDouble();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.printf("Nghiệm của phương trình = %.2f", -b/a);
		}
	}
}
