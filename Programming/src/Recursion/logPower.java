package Recursion;

import java.util.Scanner;

public class logPower {
    private static int pow(int a, int b){
        if(a==0 && b==0 ) {
            System.out.println("Not defined");
            return -1;
        }

        if(b==0) return 1;
        int ans = pow(a, b/2);
        if(b%2==0) return ans*ans;
        else  return ans*ans*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number the base  ");
        int n = sc.nextInt();
        System.out.print("Enter another number the power ");
        int m = sc.nextInt();
        System.out.println(n+ " power raised to"+" "+ m +" "+ "is" +" "+pow(n,m));
    }

}

