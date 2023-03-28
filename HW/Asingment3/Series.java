package CSE114.HW.Asingment3;

import java.lang.Math;

class Series {

    public static double series (double x, int n) {
        if(x <= -1 || x >= 1.0) return -1.0;
        if(n <= 0) return -1.0;
        
        double ans = 1.0;
        int std = 2;
        
        while(std <= n){
            double temp = (1.0/std) * Math.pow(x, std - 1);
            if(std % 2 == 0) temp *= -1;
            // System.out.println("*" + temp);
            ans += temp;
            std++;
        }

        return ans;
    }

    public static void main(String[] args){
        // sample 1
        System.out.print("series(0.6, 3) should be 0.82");
        System.out.println(" : " + series(0.6, 3));

        // sample 2
        System.out.print("series(0.6, 4) should be 0.766");
        System.out.println(" : " + series(0.6, 4));

        // sample 3
        System.out.print("series(0.6, 5) should be 0.79192");
        System.out.println(" : " + series(0.6, 5));

        // error 1
        System.out.print("series(-1.5, 3) should be -1.0");
        System.out.println(" : " + series(-1.5, 3));

        // error 2
        System.out.print("series(1.5, 3) should be -1.0");
        System.out.println(" : " + series(1.5, 3));

        // error 3
        System.out.print("series(0.5, 0) should be -1.0");
        System.out.println(" : " + series(0.5, 0));

        // my case 1
        System.out.print("series(0.8, 1) should be 1.0");
        System.out.println(" : " + series(0.8, 1));

        // my case 2
        System.out.print("series(0.8, 2) should be 0.6");
        System.out.println(" : " + series(0.8, 2));

        // my case 3
        System.out.print("series(0.8, 3) should be 0.8133333333333334");
        System.out.println(" : " + series(0.8, 3));
    }

}
