import java.util.*;

public class Lab1_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoten = sc.nextLine();
		System.out.print("Điểm TB: ");
		double diemtb = sc.nextDouble();
		System.out.printf("%s %.1f điểm", hoten, diemtb);
	}

}
