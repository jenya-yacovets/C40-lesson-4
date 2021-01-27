import java.util.Arrays;
import java.util.Random;

public class Example_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mass =new int[3][3];

        for(int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {
                mass[i][j] = random.nextInt(10);
            }

        }

        for(int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {

                if (mass[i][j] % 2 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print(mass[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}
