package LAB4;

import java.util.Scanner;

public class SanPham{
	private String tenSp;
	private double donGia;
	private double giamGia;

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

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
