package Recursion;
// To print the Binary String without excluding the consecutive 1's
public class binaryStrings {
    public static  void printStrings(int n, String s){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printStrings(n, s+1);
            printStrings(n, s+0);
        }
        else {
            printStrings(n, s + 0);
        }
    }
    public static void main(String[] args) {
        printStrings(4, "");
    }
}
