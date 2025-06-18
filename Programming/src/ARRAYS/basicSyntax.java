package src.ARRAYS;

import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < 5; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0 ; i<5; i++){
            System.out.print(array[i] + " ");
        }
    }
}
