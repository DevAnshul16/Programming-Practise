package PATTERNS.SPECIALPATTERNS;

import java.util.Scanner;

public class crossStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++){

            for(int j= 1 ; j<=n;j++){
                if (i == j || i + j == n+1) {
                    System.out.print("* ");
                    // your code
                }
                else{
                    System.out.print(" "+" ");
                }

            }

            System.out.println();
        }
    }
}
