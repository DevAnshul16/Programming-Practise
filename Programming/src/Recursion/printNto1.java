package Recursion;

import java.util.Scanner;

public class printNto1 {
    public static int Nto1(int n){
        System.out.println( n);
        if(n==1) return 1; // Base Case
        return Nto1(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Nto1(n);

    }
}
