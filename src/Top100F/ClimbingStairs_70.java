package Top100F;

import java.util.ArrayList;

public class ClimbingStairs_70 {

    public static int climbStairs(int n) {

        //climb(n," ");




        return 0;
    }

    public static int climb(int n,String s) {
        ArrayList<String> a = new ArrayList<String>();
        String s1;
        String s2;
        if(n >= 2){
            s1 = s + "1 step ";
            s2 = s + "2 step ";
            climb(n-1, s1);
            climb(n-2, s2);
        }
        else if(n >= 1){

            s1 = s + "1 step ";
            climb(n-1, s1);

        }
        if(n == 0){
            System.out.println(s);
        }
        return 0;
    }

    public static void  main(String args[]) {

        climbStairs(3);

    }
}
