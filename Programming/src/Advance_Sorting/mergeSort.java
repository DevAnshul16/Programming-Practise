package Advance_Sorting;
// Merge Sort Program
public class mergeSort {
    public static void print(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void merge(int []a , int[] b, int[] c){
        int i = 0 , j =0 , k= 0 ;
        while(i<a.length && j< b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(j< b.length) c[k++] = b[j++];
        while(i< a.length) c[k++] = a[i++];

    }
    public static void merge_Sort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int [] b = new int [n-n/2];
        for(int i = 0 ; i<n/2; i++){
            a[i] = arr[i];
        }
        for(int i = 0 ; i<n-n/2; i++){
            b[i] = arr[i +n/2];
        }
        merge_Sort(a);
        merge_Sort(b);
        merge(a, b, arr);
        a = null;
        b = null;
    }
    public static void main(String[] args) {
        int [] arr = {10, 30, 20, 0 , 100, 1 , 2};
        merge_Sort(arr);
        print(arr);

    }

}
