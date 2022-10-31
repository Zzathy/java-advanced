package Task124;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/** 
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Panjang\t: ");
        balok.setPanjang(input.nextInt());
        System.out.print("Input Lebar\t: ");
        balok.setLebar(input.nextInt());
        System.out.print("Input Tinggi\t: ");
        balok.setTinggi(input.nextInt());
        balok.hasil();
    }
}
