package Recursion.Advance;

public class PermutationString {
//    public static void permutation(String str, String permutation){
//       if(str.length()==0){
//           System.out.println(permutation);
//           return;
//       }
//        for(int i=0;i<str.length();i++){
//            char currentchar=str.charAt(i);
//            //abc-> ab
//            String newString=str.substring(0,i)+str.substring(i+1);
//            permutation(newString,permutation+currentchar);
//        }
//    }
//
//    public static void main(String[] args) {
//        String str="abc";
//        permutation(str,"");
//    }
    public static void calpemutation(String str, String permutation){
       if(str.length()==0){
           System.out.println(permutation);
           return;
       }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            calpemutation(newString,permutation+currChar);
        }

    }

    public static void main(String[] args) {
        String str="abc";
        calpemutation(str,"");
    }
}
//permutation
//-> All possible combination of letter
//3p3=3!=6
//n!