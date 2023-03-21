package stepik;

import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//        System.out.println(iSNumbersBetweenZeroAndOne(x, y));

//        System.out.println(sqrtNewtonMethod(9.0, .001));
//        System.out.println();
//
//        System.out.println(arithmeticProgressionSum(999));
//        System.out.println();
        printFibonacci(15);

    }

    public static void checkIsNumbersEquals (int count) {
        double sum = 0;
        int a = 0;
        for (int i = 0; i < count; i++) {
            a = scanner.nextInt();
            sum += a;
        }
        if (sum / count == a) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Not equals");
        }
    }

    public static boolean iSNumbersBetweenZeroAndOne(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            return true;
        }
        return false;
    }

    public static int arithmeticProgressionSum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }
    public static double sqrtNewtonMethod (double t0, double accuracy) {
        double t = t0;
        while (Math.abs(t - t0/t) > accuracy) {
            t = (t0/t + t) / 2.0;
        }
        return t;
    }

    public static void printFibonacci (int n) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
