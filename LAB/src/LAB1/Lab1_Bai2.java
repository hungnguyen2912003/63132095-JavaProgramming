package LAB1;

import java.util.Scanner;

public class Lab1_Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		Double dai = sc.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		Double rong = sc.nextDouble();
		Double chuvi = (dai + rong) * 2;
		Double dientich = dai * rong;
		Double canhnhonhat = Math.min(dai, rong);
		System.out.printf("Chu vi hình chữ nhật = %.2f\n", chuvi);
		System.out.printf("Diện tích hình chữ nhật = %.2f\n", dientich);
		System.out.printf("Cạnh nhỏ nhất hình chữ nhật = %.2f", canhnhonhat);
	}
}
