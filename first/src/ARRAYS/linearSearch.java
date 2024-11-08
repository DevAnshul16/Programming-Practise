package ARRAYS;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int j;
        System.out.println("Enter the values in array");
        for (int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the number to be searched");
        int search = sc.nextInt();
        boolean flag = false;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]== search){
                flag = true;
                break;
            }
            j=i;

        }
        if (flag== true) System.out.println("Element Found");
        else System.out.println("Not Found");
    }
}
