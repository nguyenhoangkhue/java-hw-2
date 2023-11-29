package HW;
import java.util.Scanner;
public class Hw1 {
    //Viết chương trình tính chu vi và diện tích của hình chữ nhật với chiều dài và chiều rộng nhập vào từ bàn phím
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài:");
        Double length = sc.nextDouble();

        System.out.println("Nhập chiều rộng:");
        Double wide = sc.nextDouble();


        System.out.println("chu vi chữ nhật là:"+ 2*(wide + length));
        System.out.println("diện tích chữ nhật là:"+ (wide * length));
    }
}
