
import java.util.Scanner;

public class Lab1_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = sc.nextDouble();
		System.out.printf("Delta = %.2f", Math.pow(b,2) - 4 * a * c);
	}

}
