package ARRAYS;
                                      //REVERSING OF ARRAY USING TWO POINTERS
public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40 ,50 ,60,70};
        int n = arr.length;
        int i = 0;
        int j= n-1;
        for (int element:arr) {
            System.out.print(element+" ");


        }
        System.out.println();
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }

        for (int element:arr) {
            System.out.print(element+" ");

        }


    }
    public static void swap(int [] arr, int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

}
