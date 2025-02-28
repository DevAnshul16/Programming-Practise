package Recursion;

import java.util.Scanner;

public class oneToN {
    public static void oneToN(int n){
        if(n==0) return ;
        oneToN(n-1);
        System.out.println( n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        oneToN(n);

    }
}
