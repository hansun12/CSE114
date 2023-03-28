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

        if(rate != 100.0){
            System.out.printf("Age Discount is: %.2f %%\n", rate);
        }
    
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
        
        // after calculate
        if((int)dcAge == 100){
            System.out.printf("\nYou're ticket price is 0.00\n");
            sc.close();
            return;
        }
        if((int)dcLuck != 0){
            System.out.printf("Lucky discount is %.1f%% [You're a winner!]\n", dcLuck);
        }
        else {
            System.out.printf("\n");
        }
        
        // calculate discount
        price = price * (100.0 - dcAge) / 100.0;
        price = price * (100.0 - dcLuck) / 100.0;
        System.out.printf("You're ticket price is %.2f\n", price);
        
        sc.close();
    }

}