import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Example_1 {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] mass = new Integer[10];

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(21);
        }

        System.out.println(Arrays.toString(mass));

        Arrays.sort(mass, Collections.reverseOrder());

        System.out.println(Arrays.toString(mass));
    }
}
