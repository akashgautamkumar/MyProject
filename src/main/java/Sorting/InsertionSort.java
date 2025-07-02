package Sorting;

import java.util.Scanner;

import static Sorting.BubbleSort.printArray;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size=sc.nextInt();
        System.out.println("Enter "+size+" elements");
        int[] a=new int[size];
        //Array insertion
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        //insertion sort
        for(int i=1;i<size;i++){
            int current=a[i];
            int j=i-1;
            while(j>=0 && a[j]>current){
                //keep swapping
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
    System.out.println("Sorted array: ");
        printArray(a);
    }
}
//Sort Array using InsertionSort
//Idea: Take an element from the unsorted array,
// place it in its corresponding position in the sorted part, and shift the elements accordingly.
//Time Complexity: O(N2)
