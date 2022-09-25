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

        String nim;
        int code, loop = 0;

        do {
            System.out.print("Input NIM : ");
            try {
                nim = input.nextLine();
                if (nim.length() == 15) {
                    code = Integer.parseInt(nim.substring(4, 12));
                    if (code != 10370311) {
                        loop = 1;
                        throw new Exception("Format NIM salah");
                    } else {
                        loop = 0;
                        System.out.println("NIM Benar");
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
