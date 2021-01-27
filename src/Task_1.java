import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[10];

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(21);
        }

        System.out.println(Arrays.toString(mass));

        for (int i=mass.length - 1; i>= 0; i--) {
            for (int j = 0; j<i; j++) {
                if (mass[j] > mass[j+1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(mass));
    }
}