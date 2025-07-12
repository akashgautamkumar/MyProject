package Recursion.Advance;

public class TilesPlacement {
    public static int calculateways(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //place vertically
        int vertplacement=calculateways(n-m,m);

        //place horizontally
        int horplacement=calculateways(n-1,m);
        return vertplacement+horplacement;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(calculateways(n,m));
    }
}
