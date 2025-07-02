package Recursion;

import java.util.Scanner;

public class SortedArray {
    public static void checkSortedArray(int a[],int index){
        if(index==0){
            System.out.println("Sorted");
            return;
        }
        if(a[index]<a[index-1]){
            System.out.println("Not sorted");
            return;
        }
        checkSortedArray(a,index-1);
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
        int index=size-1;
        checkSortedArray(a,index);
    }
}
//check if your array is Strictly sorted (increasing order)
