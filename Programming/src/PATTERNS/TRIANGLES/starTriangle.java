package PATTERNS.TRIANGLES;

import java.util.Scanner;

public class starTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){    // number of rows
            for(int j = 1; j<=i;j++){  // no star in each lines
                System.out.print("*"+" ");

            }
            System.out.println();
        }

    }

}
