package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOH(int n,String source,String helper, String destination){
        if(n==1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        TOH(n-1,source,destination,helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        TOH(n-1,helper,source,destination);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disk available in source: ");
        int n= sc.nextInt();
        TOH(n,"Source","Helper","Destination");
    }
}
//This is one of the classical problem where we have to shift disks from one tower to another (source to destination)
//rules: 1. only one disk can be moved at a time
      // 2. Smaller disk are kept always to of the larger disk

//Time complexity is O(n)=2^n-1