package Recursion;

import java.util.Scanner;

public class arrayTraversal {
    public static void   arrayTraversal(int[] arr, int n ){
        if(n == arr.length) return;
        System.out.print(arr[n]+" ");
        arrayTraversal(arr, n+1);

    }
    public static void main(String[] args) {
        System.out.println("Enter 5 elements in array");
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        arrayTraversal(arr, 0);

    }
}
