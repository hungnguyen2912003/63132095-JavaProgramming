package LAB1;

import java.util.Scanner;

public class Lab1_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập cạnh của hình lập phương: ");
		double canh = sc.nextDouble();
		System.out.printf("Thể tích của hình lập phương = %.3f", Math.pow(canh, 3));
	}

}
