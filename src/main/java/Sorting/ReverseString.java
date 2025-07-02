package Sorting;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        StringBuilder Name=new StringBuilder(sc.nextLine());
        for(int i=0;i<Name.length()/2;i++){
            int front=i;
            int back=Name.length()-1-i;
            char frontChar=Name.charAt(front);
            char backChar=Name.charAt(back);
            //swapping character
            Name.setCharAt(front,backChar);
            Name.setCharAt(back,frontChar);
        }
        System.out.println("Reversed String: "+Name);
    }
}
