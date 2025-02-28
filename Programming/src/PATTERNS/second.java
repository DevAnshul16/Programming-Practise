package PATTERNS;

import java.util.Scanner;

                                                                   //SIDE SQUARE PATTERN (N X N )
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=n;j++){
                System.out.print("*"+ " ");

            }
            System.out.println();
        }

    }
}
