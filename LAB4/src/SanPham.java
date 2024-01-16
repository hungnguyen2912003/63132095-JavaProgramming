import java.util.Scanner;

public class SanPham{
	public String tenSp;
	public double donGia;
	public double giamGia;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		this.tenSp = scanner.nextLine();
		System.out.print("Đơn giá: ");
		this.donGia = scanner.nextDouble();
		System.out.print("Giảm giá: ");
		this.giamGia = scanner.nextDouble();			
	}
	public SanPham() {
		tenSp = "Điện thoại";
		donGia = 5000;
		giamGia = 2500;
	}
	
	public SanPham(String ten, double gia, double giagiam)
	{
		this.tenSp = ten;
		this.donGia = gia;
		this.giamGia = giagiam;
	}
	
	public SanPham(String tenSp, double donGia)
	{
		this.tenSp = tenSp;
		this.donGia = donGia;
	}
	
	public void output() {
		System.out.println("Tên sản phẩm: " + this.tenSp);
		System.out.println("Đơn giá: " + this.donGia);
		System.out.println("Giảm giá: " + this.giamGia);
	}
	
	double getThueNhapKhau()
	{
		return donGia * 0.1;
	}
}
