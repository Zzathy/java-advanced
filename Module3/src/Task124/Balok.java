/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Task124;

/**
 *
 * @author izzai
 */
public class Balok {
    private int panjang, lebar, tinggi;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil Luas Balok\t: " + ph.luas(this));
        System.out.println("Hasil Volume Balok\t: " + ph.volume(this));
    }
}
