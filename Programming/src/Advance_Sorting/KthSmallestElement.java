package Advance_Sorting;

import java.util.Scanner;

public class KthSmallestElement {
    static int ans;
    public static void swap(int[]arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void quick_Select(int[]arr, int lo , int hi, int k ){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans = arr[lo];
            return;
        }
        int idx = partition(arr, lo , hi);
        if (idx ==k-1){
            ans = arr[idx];
        }
        if(k-1<idx) quick_Select(arr, lo, idx-1,k);
        else quick_Select(arr, idx+1, hi,k);
    }
    public static int partition(int[]arr, int lo, int hi){
        int pivot = arr[lo];
        int smallerCount = 0 ;
        for(int i = lo+1; i<=hi; i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = lo +smallerCount;
        swap(arr, lo, correctIdx);
        //partition
        int i = 0 , j = hi;
        while(i< correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if (arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot) {
                swap(arr, i ,j);
            }
        }
        return correctIdx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ans = -1;
        System.out.print("Enter a number for kth smallest number");
        int k  = sc.nextInt();
        int [] arr = {4,9,7,1,3,6,5,8};
        quick_Select(arr, 0 , arr.length-1,k);
        System.out.println("Number"+" "+k+" "+"smallest number is :"+ans);
    }
}
