

import java.util.Scanner;

public class Lab2_Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng: ");
        double sodien = sc.nextDouble();
        double tiendien;
        if(sodien >= 0 && sodien <= 50)
        {
            tiendien = 1000 * sodien;
        }
        else{
            tiendien = 50 * 1000 + (sodien - 50) * 1200;
        }
        System.out.printf("Số tiền điện = %.3f", tiendien);
    }
}