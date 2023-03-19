package CSE114.HW.Asignment2;

import java.util.Scanner;

public class Change {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        amount *= 100;

        int cnt = (int)amount / 5000;
        amount -= (double)cnt * 5000.0;
        System.out.printf("%d $50 bills\n", cnt);

        cnt = (int)amount / 2000;
        amount -= (double)cnt * 2000.0;
        System.out.printf("%d $20 bills\n", cnt);

        cnt = (int)amount / 1000;
        amount -= (double)cnt * 1000.0;
        System.out.printf("%d $10 bills\n", cnt);

        cnt = (int)amount / 500;
        amount -= (double)cnt * 500.000;
        System.out.printf("%d $5 bills\n", cnt);

        cnt = (int)amount / 100;
        amount -= (double)cnt * 100.0;
        System.out.printf("2 $1 bills\n");

        cnt = (int)amount / 50;
        amount -= (double)cnt * 50.0;
        System.out.printf("%d Half dollar coin\n", cnt);

        cnt = (int)amount / 25;
        amount -= (double)cnt * 25.0;
        System.out.printf("%d quarters\n", cnt);

        cnt = (int)amount / 10;
        amount -= (double)cnt * 10.0;
        System.out.printf("%d dimes\n", cnt);

        cnt = (int)amount / 5;
        amount -= (double)cnt * 5.0;
        System.out.printf("%d nickels\n", cnt);

        cnt = (int)amount / 1;
        amount -= (double)cnt * 1.0;
        System.out.printf("%d pennies\n", cnt);

        sc.close();
    }
}
