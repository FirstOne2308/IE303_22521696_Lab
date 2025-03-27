import java.util.Random;

public class Bai_2 {
    void TinhSoPi (){
        int n = 10000000;
        Random rand = new Random();
        int count = 0;
        float r = 1;
        for (int i = 0; i < n; i++){
            float x = (rand.nextFloat() * 2 * r) - r;
            float y = (rand.nextFloat() * 2 * r) - r;

            if(x*x + y*y <= r*r){
                count++;
            }
        }
        System.out.println("Pi: " + (float)count/n * 4 );
    }
}
