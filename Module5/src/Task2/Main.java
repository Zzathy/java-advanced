package Task2;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50 };

        Arrays.sort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        // for (int number : data) {
        // System.out.print(number + ", ");
        // }

        System.out.print("\nInput angka : ");
        int number = input.nextInt();

        int index = Arrays.binarySearch(data, number);
        System.out.println(index);
    }
}
