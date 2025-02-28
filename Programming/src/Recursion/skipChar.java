package Recursion;
// Remove all occurrences of char 'a' in a given string
public class skipChar {
    public static void  skipChar(String a, int b ){
        if(b==a.length()) return;
        if(a.charAt(b)!='a'&& a.charAt(b)!='A'){
            System.out.print(a.charAt(b));
        }
        skipChar(a,b+1);
    }
    public static void main(String[] args) {
        String a = "Star are vary beautiful aspects of space";
        skipChar(a,0);

    }
}
