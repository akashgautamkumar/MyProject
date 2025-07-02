package Recursion;

import java.util.Scanner;

public class firstAndLastOccurrence {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurrence(char a,String str1,int index){
        if(str1.length()==index){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar=str1.charAt(index);
        if(currentChar==a){
            if(first==-1)
                first=index;
            else
                last=index;
        }
        findOccurrence(a,str1,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String and character for which you want to search character");
        String str=sc.nextLine();
        char ch='a';
        int index=0;
        findOccurrence(ch,str,index);
    }
}

//Find the first and last occurrence of character in string

//Time Complexity O(n)