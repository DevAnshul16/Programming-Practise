package Recursion;

public class validParan {
    public static void validans(int open, int close , int n , String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) validans(open+1, close, n , s+"(");
        if(close<open) validans(open, close+1, n, s+")");

    }
    public static void main(String[] args) {
        validans(0 , 0 , 4 , "");

    }
}
