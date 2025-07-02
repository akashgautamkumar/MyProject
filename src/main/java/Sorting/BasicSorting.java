package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BasicSorting {
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
        //using array sort method
        Arrays.sort(arr);
        System.out.println("Sorted Array: ");
        //printing array
        for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
