package CSE114.HW.Asingment3;

import java.util.Scanner;
import java.util.Random;

class Ticket {
    static double price = 21.0;

    static double calculatePriceByAge(int age) {
        double rate = 0.0;

        if(age >= 65) rate = 25.0;
        else if(age >= 22) rate = 0.0;
        else if(age >= 19) rate = 15.0;
        else if(age >= 7) rate = 20.0;
        else rate = 100.0;

        System.out.printf("Age Discount is: %.2f %%\n", rate);
        return rate;
    }

    static double calculatePriceByLuck(){
        int r = new Random().nextInt(10) + 1;
        double rate = 0.0;

        if(r >= 8) rate = 25.0;
        else if(r >= 5) rate = 10.0;
        
        return rate;
    }

    public static void main(String[] args){
        // greetings
        System.out.print("Please enter your age: ");
        Scanner sc = new Scanner(System.in);

        // setting discount
        int age = sc.nextInt();
        double dcAge = calculatePriceByAge(age);
        double dcLuck = calculatePriceByLuck();
        if((int)dcLuck != 0){
            System.out.printf("Lucky discount is %.1f%% [You're a winner!]\n", dcLuck);
        }
        else {
            System.out.printf("\n");
        }
        // calculate discount
        if((int)dcAge == 100){
            System.out.printf("You're ticket price is 0.00\n");

            sc.close();
            return;
        }

        price = price * ((100.0 - (dcAge + dcLuck)) / 100.0);
        System.out.printf("You're ticket price is %.2f\n", price);
        
        sc.close();
        // 6살 처리
        // 곱 연산 처리
    }

}
