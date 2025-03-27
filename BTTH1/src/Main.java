import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bai 1
        float r = sc.nextFloat();
        Bai_1 bai1 = new Bai_1();
        bai1.DienTichHinhTron(r);
//        //Bai 2
        Bai_2 bai2 = new Bai_2();
        bai2.TinhSoPi();
        //Bai 3
        Bai_3 bai3 = new Bai_3();
        bai3.Output();
    }
}
