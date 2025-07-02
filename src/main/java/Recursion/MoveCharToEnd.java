package Recursion;

import java.util.Scanner;

public class MoveCharToEnd {

    public static void moveFunction(String str,int index,int count,char ch,String newString){

       if(index==str.length()){
           for(int i=1;i<=count;i++)
               newString+=ch;
           System.out.println(newString);
           return;
       }
        char currentChar=str.charAt(index);
        if(currentChar==ch){
            count++;
            moveFunction(str,index+1,count,ch,newString);
        }
        else{
            newString+=currentChar;
            moveFunction(str,index+1,count,ch,newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String and character which you want to move");
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        moveFunction(s,0,0,ch,"");
    }
}
//Move Specific character to end
// e.g Str=axbcxxd
//o/p abcdxxx
//Time Complexity O(n)
