package CSE114.HW.Asingment3;
import java.util.Random;
import java.util.Scanner;

public class Craps {

    public static char evaluateRoll(int point, int dice1, int dice2){
        char result;

        if(point == 0){
            if(dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12){
                result = 'l';
            }

            else if(dice1 + dice2 == 7 || dice1 + dice2 == 11){
                result = 'w';
            }
        }
        else{
            if(point == dice1 + dice2){
                result = 'd';
            }
            else{
                result = 'c';
            }
        }
        return result;
    }

    public static int roll(){
        Random random = new Random();

        return random.nextInt(6) + 1;
    }

    public static void point(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Play Craps? (y/n): ");
        String play = sc.next();

        while(play.equals("y")){
           while(true){
            int point;
            point = 0;

            int dice1 = roll();
            int dice2 = roll();
            System.out.printf("(%d, %d)", dice1, dice2);
            
            char result = evaluateRoll(point, dice1, dice2);

            if(result == 'w'){
                point = 0;
                System.out.println("Player wins!");
            }
            else if(result == 'l'){
                point = 0;
                System.out.println("player looses!");
            }
            else if(result == 'c'){
                point = dice1 + dice2;
                dice1 = roll();
                dice2 = roll();
                System.out.printf("(%d, %d)", dice1, dice2);
                evaluateRoll(point, dice1, dice2);
            }
            else if(result == 'p'){
            System.out.println("Player wins!");
            }

           }
          
           
        }
        System.out.println("Thanks for playing!");
    }
}
