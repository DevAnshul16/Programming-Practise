package PATTERNS.SPECIALPATTERNS;
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

import java.util.Scanner;

public class floydsTriangle {

    public static void main(String[] args) {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){

            for(int j= 1 ; j<=i;j++){
                System.out.print(a+" ");
                a= a+1;

            }
            System.out.println();
        }
    }
}
