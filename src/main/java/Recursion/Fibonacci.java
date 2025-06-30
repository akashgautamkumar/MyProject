package Recursion;


import java.util.Scanner;

public class Fibonacci {
    public static void fibo(int a, int b,int range){
        int c=a+b;
        if(range==0)
            return;
        else{
            System.out.print(c+" ");
            fibo(b,c,range-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b + " ");
        if(range>2) {
            Fibonacci.fibo(a, b, range - 2);
        }
    }
}
//need to improve code for input = 1