package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder name =new StringBuilder(sc.nextLine());
        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-1-i;
            char frontChar= name.charAt(front);
            char backChar=name.charAt(back);
            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);
        }
        System.out.println("Reversed String : "+name);
    }
}
//Reverse String using StringBuilder
