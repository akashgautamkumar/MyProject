package Recursion.Advance;

public class MazeMove {
    public static int countMaze(int i, int j,int m, int n){

        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //downward
        int downward=countMaze(i+1,j,m,n);

        //rightward
        int rightward=countMaze(i,j+1,m,n);

        return downward+rightward;

    }

    public static void main(String[] args) {
        int n=3,m=3;
        int totatCount=countMaze(0,0,m,n);
        System.out.println("Total Count: "+totatCount);
    }
}
//count total number of move from (0,0) to (n,m) in matrix