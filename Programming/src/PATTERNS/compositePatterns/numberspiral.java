package PATTERNS.compositePatterns;

import java.util.Scanner;

public class numberspiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        for(int i = 1; i <=2*n-1; i++){

            for(int j= 1 ; j<=2*n-1;j++){
                int a = i , b = j;          // using concept of pseudo numbers
                if(i > n) a = 2*n-i;
                if(b>n)   b = 2*n-j;

                System.out.print(n+1-Math.min(a,b) + " ");
            }



            System.out.println();
        }

    }
}
