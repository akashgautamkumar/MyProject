package Recursion;

import java.util.Scanner;

public class SortedArrayMeth2 {
    public static boolean checksorted(int[] a,int index){
        if(index==a.length-1){
            return true;
        }
        if(a[index]<=a[index+1]){
            return checksorted(a,index+1);
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size=sc.nextInt();
        System.out.println("Enter array to check it is sorted or not");
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int index=0;
        System.out.println(checksorted(a,index));
    }
}
