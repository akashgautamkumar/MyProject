package Recursion.Advance;

public class CallingGuest {
    public static int callGuestInParty(int n){
        if(n<=1){
            return 1;
        }
        //single call
        int way1=callGuestInParty(n-1);

        //pair call
        int way2=(n-1)*callGuestInParty(n-2);
        return way1+way2;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuestInParty(n));
    }
}
