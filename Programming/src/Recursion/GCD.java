package Recursion;

public class GCD {
    static int gcd(int a , int b){
        if(b%a ==0) return a;
        return gcd(b%a, b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(36, 60));
    }
}
