package Task3;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Size : ");
        int size = input.nextInt();

        int[] data = new int[size];
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < data.length; i++) {
            System.out.print("Input Array : ");
            data[i] = input.nextInt();

        }
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }

        // validate positif, negatif dan zero
        for (int j : data) {
            if (j > 0) {
                a++;
            } else if (j < 0) {
                b++;
            } else {
                c++;
            }
        }

        float positivo = (float) a / data.length;
        float negativo = (float) b / data.length;
        float cero = (float) c / data.length;

        System.out.printf("\nPositive : %f", positivo);
        System.out.printf("\nNegative : %f", negativo);
        System.out.printf("\nZero : %f", cero);
    }
}
