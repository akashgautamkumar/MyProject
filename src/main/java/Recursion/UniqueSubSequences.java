package Recursion;


import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubSequences {
    public static void findUniqueSequence(String str, int index, String newString, HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar=str.charAt(index);

        //to be
        findUniqueSequence(str,index+1,newString+currentChar,set);
        //not to be
        findUniqueSequence(str,index+1,newString,set);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        HashSet<String> set=new HashSet<>();
        findUniqueSequence(s,0,"",set);
    }
}

//Most important question