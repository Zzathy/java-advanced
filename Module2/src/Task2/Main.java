/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Task2;

/**
 *
 * @author izzai
 */
public class Main {
    void cekName(char name),

    cekFrom(char from),

    cekDate(int date), list();

        String book[10][100] = {{"This is Book, Malang. 2022"}};
        String place[][10] = {{"Malang"}, {"Bandung"}, {"Surabaya"}};

    void cekDate(int date) {
        if (date < 2018 || date > 2022) {

        }
    }

    void cekFrom(char from) {
        for (int i = 0; place[i][0] != "\0"; i++) {
            if (from.compareTo(place[i]) == 0) {
                return i;
            }
        }
    }

    void cekName(char name) {
        for (int i = 0; book[i][0] != "\0"; i++) {
            if (name.compareTo(book[i]) == 0) {
                return i;
            }
        }
    }

    void list() {
        for (int i = 0; book[i][0] != "\0"; i++) {
            System.out.println(book[i]);
        }
    }

    public static void main(String[] args) {
        char inName, inFrom, inDate;
        int inIndex;

        System.out.println("Welcome to Libary");
        System.out.println("Nama : ");
        inName = input.nextLine();
        cekName(inName);
        System.out.println("From : ");
        inName = input.nextLine();
        System.out.println("Date : ");
        inDate = input.nextInt();
        cekDate(inDate);
        System.out.println(inName + "" + inFrom + "" + inDate);
        book[1] = new String(name);
        System.out.println("Buku berhasil ditambahkan");
    }
}