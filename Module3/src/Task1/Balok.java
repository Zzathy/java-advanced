/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Task1;

/**
 *
 * @author izzai
 */
public class Balok {
    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil Luas Balok\t: " + ph.luas(this));
        System.out.println("Hasil Volume Balok\t: " + ph.volume(this));
    }
}
