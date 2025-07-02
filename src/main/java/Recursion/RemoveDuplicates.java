package Recursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static boolean[] map =new boolean[26];
    //denotes all alphabet letters
    public static void removeDup(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        // if we substract any character with a it will give that letter index
        if(map[currChar - 'a']){
            removeDup(str,index+1,newString);
        }
        else{
            map[currChar-'a']=true;
            newString+=currChar;
            removeDup(str,index+1,newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        removeDup(st,0,"");
    }
}
//Remove duplicates from String
//e.g = abbccd
//o/p=abcd

//Time Complexity O(n)