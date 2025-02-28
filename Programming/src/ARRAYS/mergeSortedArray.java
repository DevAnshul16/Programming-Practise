package ARRAYS;

public class mergeSortedArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,0,0,0,0,0};
        int [] b = {6,7,8,9,10};
//        int [] c = new int[a.length + b.length];
//        int i =0;int j=0;int k =0;
//        while(i<a.length && j < b.length){
//            if(a[i]<b[j]){
//                c[k]= a[i];
//                i++; k++;
//
//            }
//            else{
//                c[k]= b[j];
//                j++; k++;
//            }
//        }
//        if (i==a.length){
//            while (j<b.length){     // Long method with greater time and space complexity!
//                c[k]= b[j];
//                j++; k++;
//            }
//        }
//        if (j==b.length){
//            while (i<a.length){
//                c[k]= a[i];
//                i++;k++;
//            }
//        }
//        for (int ele: c
//             ) {
//            System.out.print(ele+" ");
//
//        }
        // Method to store elements in first array itself
        int m = a.length;
        int n = b.length;
        int i = m-1;
        int j = n-1;
        int k = m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[k]= a[i];
                i--;
                k--;

            }
            else{
                a[k]=b[j];
                j--;
                k--;
            }
        }
        while (j>=0){
            a[k]=b[j];
            j--;
            k--;
        }
        for (int ele: a
             ) {
            System.out.print(ele+" ");

        }


    }
}
