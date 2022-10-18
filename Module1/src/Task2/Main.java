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

        String name, nim, email = "", phn;

        int loop1 = 0;
        int loop2 = 0;
        int loop3 = 0;

        System.out.print("Input Nama\t: ");
        name = input.nextLine();

        do {
            System.out.print("Input NIM\t: ");
            nim = input.nextLine();

            try {
                if (nim.matches("[0-9]+")) {
                    if (nim.length() == 15) {
                        // // we can try with contains method
                        // if (nim.contains("10370311")) {
                        // substring have a chance of error if you input less than 4, 12 index
                        if (nim.substring(4, 12).equals("10370311")) {
                            loop1 = 0;
                        } else {
                            loop1 = 1;
                            throw new Exception("Kode NIM Salah");
                        }
                    } else {
                        loop1 = 1;
                        throw new Exception("Panjang NIM Lebih/Kurang Dari 15");
                    }
                } else {
                    loop1 = 1;
                    throw new Exception("Inputan Harus Angka");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            while (loop1 == 0 && loop2 == 0) {
                try {
                    System.out.print("Input Email\t: ");
                    email = input.nextLine();
                    if (email.matches("(.*)@webmail.umm.ac.id")) {
                        loop2 = 1;
                    } else {
                        loop2 = 0;
                        throw new Exception("Format Email Salah");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

            while (loop1 == 0 && loop2 == 1 && loop3 == 0) {
                try {
                    System.out.print("Input Tlp\t: ");
                    phn = input.nextLine();
                    if (phn.length() >= 10 && phn.length() <= 12) {
                        loop3 = 1;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\n====================");
                        System.out.println("Nama\t : " + name);
                        System.out.println("NIM\t : " + nim);
                        System.out.println("Email\t : " + email);
                        System.out.println("Tlp\t : " + phn);
                    } else {
                        loop3 = 0;
                        throw new Exception("Panjang Nomor Telfon Salah");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } while (loop1 == 1);
    }
}
