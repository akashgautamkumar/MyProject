package Recursion;

import java.util.Scanner;

public class PowerUsingLog {
    public static int powerOfX(int x,int n){
        int power;
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        else{
            if(n%2==0) {
                 power=powerOfX(x, n / 2)*powerOfX(x,n/2);
            }
            else {
                 power= powerOfX(x, n / 2)*powerOfX(x,n/2) * x;
            }
            return power;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X and Power of X : ");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int result=powerOfX(x,n);
        System.out.println("Result: "+result);
    }
}
