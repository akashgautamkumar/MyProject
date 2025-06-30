package Recursion;

public class PrintNumbers2 {

    public static void PrintNumbers(int n){
        if(n==6)
            return;
        else{
            System.out.print(n+" ");
            PrintNumbers(n+1);
        }
    }

    public static void main(String[] args) {
        int initial=1;
        PrintNumbers(initial);
    }
}
//Print Numbers from 1 to 5

