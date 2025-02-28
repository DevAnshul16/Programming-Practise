package Recursion;
//maze problem solution with 2 variables

import java.util.Scanner;

public class mazeProblem {
    public static int maze(int m , int n){
        if(m==1 || n==1) return 1;
        int rightWays = maze(m , n-1);
        int downWays = maze(m-1, n);
        return rightWays+ downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number ");
        int m = sc.nextInt();
        System.out.print("Enter the column number");
        int n = sc.nextInt();
        System.out.println("Total ways :" +" "+maze(m,n));

    }
}
