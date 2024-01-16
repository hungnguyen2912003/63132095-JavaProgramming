import java.util.*;
public class Lab2_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if(a == 0)
		{
			if(b == 0) {
				if(c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				}
				else {
					System.out.println("Phương trình vô nghiệm");
				}
			}
			else {
				System.out.printf("Nghiệm của phương trình = %.2f", -c/b);
			}
		}
		else {
			
			if(delta < 0)
			{
				System.out.println("Phương trình vô nghiệm");
			}
			else if(delta == 0)
			{
				System.out.printf("Phương trình có nghiệm kép = %.2f", -b/(2*a));
			}
			else {
				System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f và x2 = %.2f", (-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a));
			}
		}
	}
}
