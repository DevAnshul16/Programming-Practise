package Advance_Sorting;


public class quickSort {
    public static void swap(int[]arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void quick_Sort(int[]arr, int lo , int hi){
        if(lo>=hi) return;
        int idx = partition(arr, lo , hi);
        quick_Sort(arr, lo, idx-1);
        quick_Sort(arr, idx+1, hi);
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
        int [] arr = {4,9,7,1,2,3,6,5,8};
        quick_Sort(arr, 0 , arr.length-1);
        for (int ele:
            arr ) {
            System.out.print(ele+" ");

        }
    }
}
