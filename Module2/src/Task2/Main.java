/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Task2;

import java.util.Scanner;

/**
 *
 * @author izzai
 */
public class Main {

    static String[][] book = new String[1][100];
    static String[][] place = new String[1][100];

    static void checkDate(int date) {
        if (date < 2018 || date > 2022) {
            System.out.println("Invalid Years");
            System.out.println("Please input years between 2018-2022");
        }
    }

    static void checkFrom(String from) {
        for (int i = 0; place[0][i] != null; i++) {
            if (from.compareTo(place[0][i]) == 0) {
                return;
            }
        }
    }

    static void checkName(String name) {
        for (int i = 0; place[0][i] != null; i++) {
            if (name.compareTo(place[0][i]) == 0) {
                return;
            }
        }

    }

    static void addBook(String name) {
        for (int i = 0; i < book.length; i++) {
            if (book[0][i] != null) {
                book[0][i] = name;
            }
        }
    }

    static void list() {
        for (int i = 0; i < book.length; i++) {
            if (book[0][i] != null) {
                System.out.println((book[0][i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inName, inFrom, inDate, finalBook;

        System.out.println("welcome to library");
        list();

        System.out.print("Name : ");
        inName = input.nextLine();
        checkName(inName);
        System.out.print("From : ");
        inFrom = input.nextLine();
        checkFrom(inFrom);
        System.out.print("Date : ");
        inDate = input.nextLine();
        checkDate(Integer.parseInt(inDate));

        System.out.println(inName + " " + inFrom + " " + inDate);
        finalBook = inName + ", " + inFrom + ", " + inDate;
        addBook(finalBook);

        System.out.println("Buku berhasil ditambahkan");

        list();

    }
} 