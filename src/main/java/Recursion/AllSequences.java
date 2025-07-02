package Recursion;

import java.util.Scanner;

public class AllSequences {
    public static void sequence(String str, int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }

        char currentChar=str.charAt(index);
        //to be
        sequence(str,index+1,newString+currentChar);
        //not to be
        sequence(str,index+1,newString);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s=sc.nextLine();
        sequence(s,0,"");
    }
}
//Time Complexity O(2^n)