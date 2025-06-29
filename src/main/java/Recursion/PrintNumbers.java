package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void Number(int num) {
        if (num == 1)
            System.out.print(1+" ");
        else {
            System.out.print(num+" ");
            Number(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Range: ");
        Number(num.nextInt());
    }
}
//print Numbers from 5 to 1 using recursion