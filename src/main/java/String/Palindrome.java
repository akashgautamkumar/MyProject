package String;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to check Palindrome");
        String str=sc.nextLine();
        int size=str.length();
        char[] a =str.toCharArray();
        char[] b=new char[size];
        for(int i=0;i<size;i++){
            b[size-i-1]=a[i];
        }
       if(Arrays.equals(a,b))
           System.out.println("palindrome");
       else
           System.out.println("Not Palindrome");
    }
}
