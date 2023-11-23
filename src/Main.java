import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Aqua aqua = new Aqua();
        try {
            aqua.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        List <Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);
        numbers.add(3);

        for (int n:numbers) {

        }
    }





}
