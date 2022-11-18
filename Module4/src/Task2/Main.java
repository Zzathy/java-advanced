package Task2;

public class Main {
    public static void main(String[] args) {
        int daysT = 586;
        System.out.println(yearCon(daysT));
    }

    public static int yearCon(int daysT) {
        double years = daysT * 0.0027;
        return (int) years;
    }
}
