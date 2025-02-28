package ARRAYS;

import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i = 0 ; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i= 0; i<n;i++){
            if (array[i]>max) max = array[i];
        }
        System.out.println("The max value is " + max);
    }
}
