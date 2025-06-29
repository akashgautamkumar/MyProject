package org.example;

import java.util.Scanner;

public class BubbleSort {
    public static void printArray(int[] a){
        //enhanced For loop or For-each loop
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size=sc.nextInt();
        System.out.println("Enter Array of "+size);
        int[] arr=new int[size];
        //inserting data to array
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //using Bubble sort method
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    //Swap
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }
        System.out.println("Sorted Array: ");
        //printing array
        printArray(arr);
    }
}
//Sort the Array using Bubble Sort in Ascending Order
//Idea: if arr[i] > arr[i+1] swap them. To place the element in their
//        respective position, we have to do the following operation N-1 times.
//Time Complexity: O(N2)
