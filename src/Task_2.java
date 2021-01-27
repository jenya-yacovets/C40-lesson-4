import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mass =new int[3][3];

        for(int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {
                mass[i][j] = random.nextInt(10);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        int sum2 = 0;

        for(int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {

                if (i == j) {
                    sum += mass[i][j];
                }

                if (i+j == mass.length-1) {
                    sum2 += mass[i][j];
                }
            }
        }

        System.out.println();

        if (sum > sum2) {
            System.out.println("Главная диаганаль больше побочной");
        } else if (sum < sum2) {
            System.out.println("Побочная диаганаль больше главной");
        } else {
            System.out.println("Обе диаганали равны");
        }
    }
}
