package Task3;

import java.util.Scanner;

public class Main {
    public static int yearCon(int daysT) {
        double year = daysT * 0.0027;
        return (int) year;
    }

    public static int monthCon(int daysT) {
        double month = daysT * 0.0329 - 12;
        return (int) month;
    }

    public static int dayCon(int daysT) {
        double day = daysT * 0.1429 / 7;
        return (int) day;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Jumlah Hari : ");
            int daysT = input.nextInt();
            System.out.println(daysT + " Hari = " + yearCon(daysT) + " tahun " + monthCon(daysT) + " bulan "
                    + dayCon(daysT) + " hari");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
