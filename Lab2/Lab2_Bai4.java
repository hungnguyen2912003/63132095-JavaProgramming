

import java.util.Scanner;

public class Lab2_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choose;
        System.out.println("+----------------------------------+");
        System.out.println("1. Giải phương trình bậc 1");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+----------------------------------+");
        do{
            System.out.print("Chọn chức năng: ");
            choose = sc.nextByte();
            if(choose < 1 || choose > 4)
            {
                System.out.printf("Chức năng %d không tồn tại. Vui lòng nhập lại!\n", choose);
            }
        }while (choose < 1 || choose > 4);
        switch (choose){
            case 1:
                Lab2_Bai1.main(new String[0]);
                break;
            case 2:
                Lab2_Bai2.main(new String[0]);
                break;
            case 3:
                Lab2_Bai3.main(new String[0]);
                break;
            case 4:
                break;
        }
    }
}
