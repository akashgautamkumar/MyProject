package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void reverse(String name,int index){
        if(index==0){
            System.out.print(name.charAt(index));
            return;
        }
        System.out.print(name.charAt(index));
        reverse(name,index-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String name=sc.nextLine();
        reverse(name,name.length()-1);
    }
}
//print reverse of String using recursion
//Time Complexity O(n) where n represents length of String
