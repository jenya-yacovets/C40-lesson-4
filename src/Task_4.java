import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[10];

        for (int i=0; i< mass.length; i++) {

            boolean next;
            int save;

            do {
                next = true;

                save = random.nextInt(21);

                for (int j=0; j < i; j++) {
                    if (mass[j] == save) {
                        next = false;
                        break;
                    }
                }
            } while (!next);

            mass[i] = save;
        }

        System.out.println(Arrays.toString(mass));
    }
}
