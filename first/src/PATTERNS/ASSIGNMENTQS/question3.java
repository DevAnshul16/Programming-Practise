package PATTERNS.ASSIGNMENTQS;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){

            for(int j= 1 ; j<=n;j++){
                System.out.print(i + " ");


            }



            System.out.println();
        }

    }
}