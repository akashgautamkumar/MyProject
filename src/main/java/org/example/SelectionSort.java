package org.example;

import java.util.Scanner;

public class SelectionSort {
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size=sc.nextInt();
        System.out.println("Enter elements of "+size);
        int[] a=new int[size];
        //array insertion
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //SelectionSort
        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
                if(a[smallest]>a[j])
                    smallest=j;
            }
            //swap
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }


        //array printing
        printArray(a);
    }
}

//Take an Array from user and sort using selectionSort
//Idea: The inner loop selects the minimum element in the
// unsorted array and places the elements in increasing order.
//Time complexity: O(N2)

