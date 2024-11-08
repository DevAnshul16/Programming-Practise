package PATTERNS.SPECIALPATTERNS;

import java.util.Scanner;

public class starFLipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n = sc.nextInt();
        int m = n/2+1;
        for(int i = 1; i <=n; i++){

            for(int j= 1 ; j<=n;j++){
                if (i+j>n){
                    System.out.print("* ");

                }
                else{
                    System.out.print((char)32+" ");
                }

            }
            System.out.println();
        }
    }
}
