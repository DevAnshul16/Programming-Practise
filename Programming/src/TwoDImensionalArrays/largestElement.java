package TwoDImensionalArrays;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] arr = new int[3][3];
        int m = arr.length; // Print number of rows
        int n = arr[0].length; // Print number of columns
        System.out.println("Enter elements in 2-D Array");
        for (int i = 0 ; i <m; i++){
            for (int j =0 ; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }

            }

        }
        System.out.println("The largest element is"+" "+ max);
    }
}
