package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNum {
    public static int SumOFNatural(int range) {

        if(range==0)
            return 0;
        else{
            return range+SumOFNatural(range-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range=sc.nextInt();
        int sum= SumOFNatural(range);
        System.out.println("Sum of "+range+" natural numbers is "+sum);
    }
}
