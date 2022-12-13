/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Task1;

import java.util.Scanner;

/**
 *
 * @author izzai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50 };
        for (int i = 0; i < data.length; i++) {
            for (int j = i + i; j < data.length; j++) {
                int temporary = 0;
                if (data[i] > data[j]) {
                    temporary = data[i];
                    data[i] = data[j];
                    data[j] = temporary;
                }
            }
            System.out.print(data[i] + ", ");
        }
        System.out.print("\nInput angka : ");
        int number = input.nextInt();

        for (int k = 0; k < data.length; k++) {
            if (data[k] == number) {
                System.out.println("Index ke-" + k);
            }
        }
    }

}
