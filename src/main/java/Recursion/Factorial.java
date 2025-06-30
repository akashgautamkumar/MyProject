package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Factorial {
    public static long fac(int range){
        if(range==1 || range==0)
            return 1;
        else
            return range*fac(range-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range=sc.nextInt();
        System.out.print("Factorial: ");
        System.out.println(fac(range));
    }
}
