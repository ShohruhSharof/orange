import java.util.Random;

public class RandomUtil {
    public static Random random = new Random();
    public static int randomNumber(int n){
        return random.nextInt(n)+1;
    }
    public static int randomNumber(int min, int max){
        return random.nextInt((int) Math.random()*(max-min+1)+min);

    }


}
