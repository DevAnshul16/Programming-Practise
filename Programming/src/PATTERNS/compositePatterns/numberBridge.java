package PATTERNS.compositePatterns;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        int a =1;
        for(int i = 1; i<=2*n-1;i++){

        }
        n--;
        int nsp =1;

        System.out.println();
        for(int i = 1; i<=n; i++){

            for(int j =1; j<=n+1-i; j++){
                System.out.print(a++ + " ");

            }
            for(int j =1; j<=nsp;j++){
                System.out.print(" " + " ");
                a++;    //most important
            }
            nsp+=2;
            for (int j =5 ; j<=n+5-i;j++){
                System.out.print(a++ + " ");
            }
            System.out.println();

        }

    }

}
