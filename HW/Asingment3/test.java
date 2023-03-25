package CSE114.HW.Asingment3;
import java.util.Random;

public class test {
   
    public static void main(String[] args){
        
        Random random = new Random();

        int dice1 = random.nextInt(1,6);
        int dice2 = random.nextInt(1,6); 

        System.out.println(dice1);
        System.out.println(dice2);
    }


}
