/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1;

/**
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 25;
        } catch (Exception e) {
            System.out.println("Panjang Array tidak sesuai dengan inputan");
        }
    }
}
