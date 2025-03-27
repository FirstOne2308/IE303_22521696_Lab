import java.util.Random;

public class Bai_1 {
    void DienTichHinhTron(float r){
        int n = 10000000;
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < n; i++){
            float x = (rand.nextFloat() * 2 * r) - r;
            float y = (rand.nextFloat() * 2 * r) - r;

            if(x*x + y*y <= r*r){
                count++;
            }
        }
        System.out.println("Dien tich hinh tron: " + (float)count/n * 4 * r * r);
    }
}
