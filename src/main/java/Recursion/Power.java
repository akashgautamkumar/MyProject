package Recursion;

import java.util.Scanner;

public class Power {
    public static int powerOfX(int x,int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        else{
            int xpower=x*powerOfX(x,n-1);
            return xpower;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter X and power of X");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int result=powerOfX(x,n);
        System.out.println("Result: "+result);
    }
}
