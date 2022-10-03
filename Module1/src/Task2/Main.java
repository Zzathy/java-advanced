/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

import java.util.Scanner;

/**
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int loop = 0;

        do {
            System.out.print("Input NIM : ");
            String nim = input.nextLine();
            try {
                if (nim.length() == 15) {
                    // // we can try with contains method
                    // if (nim.contains("10370311")) {
                    // substring have a chance of error if you input less than 4, 12 index
                    if (nim.substring(4, 12).equals("10370311")) {
                        loop = 0;
                        System.out.println("NIM Benar");
                    } else {
                        loop = 1;
                        throw new Exception("Kode NIM salah");
                    }
                } else {
                    loop = 1;
                    throw new Exception("Panjang NIM lebih/kurang dari 15");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (loop == 1);
    }
}
