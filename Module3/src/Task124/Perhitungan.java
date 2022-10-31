/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task124;

/**
 *
 * @author izzai
 */
public class Perhitungan {

    public int volume(Balok sisi) {
        return 4 * sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public int luas(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }
}
