package ARRAYS;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int [] array = new int[n];
        int  c = 0, d=0;

        for (int i = 0 ; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;
        for (int i= 0; i<n;i++){
            if (array[i]>max) {
                max = array[i];
                c=i;
            }
        }

        for (int i = 0 ; i<n;i++){
            if(array[i]>smx && array[i]!=max){
                smx= array[i];
                d=i;
            }
        }
        if (array[c]== array[d]){
            smx=max;
        }
        System.out.println("The max value is " + max);
        System.out.println("The second max value is " + smx);
    }
}
