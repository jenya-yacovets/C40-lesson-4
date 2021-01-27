import java.util.Random;

public class Task_3 {
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

        int maxNumber = 0;
        int maxNumberIndex = 0;
        int maxNumberIndex2 = 0;

        for (int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {

                if (mass[i][j] > maxNumber) {
                    maxNumber = mass[i][j];
                    maxNumberIndex = i;
                    maxNumberIndex2 = j;
                }
            }
        }


        mass[maxNumberIndex][maxNumberIndex2] = mass[mass.length-1][mass[mass.length-1].length-1];
        mass[mass.length-1][mass[mass.length-1].length-1] = maxNumber;

        System.out.println();
        System.out.println();

        for(int i=0; i<mass.length; i++) {

            for (int j=0; j<mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }

            System.out.println();
        }
    }
}
