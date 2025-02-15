package BinarySearch;
//LT 34 find first and last position of a given element in a given array, optimized solution
public class firstAndLastPos {
    public static void main(String[] args) {
        int[] arr = { 10,20,20,30,40,50,60,70,80};
        find_Position(arr, 90);
        int[] result = find_Position(arr,20);
        System.out.println(result[0]+" "+result[1]);
    }
    public static int[] find_Position(int[] arr , int target ){
        int ans[] = {-1,-1};
        int fp =-1;
        int lp = -1;
        // finding the first position
        int hi = arr.length-1;
        int lo = 0;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]== target){
                if (mid>0 && arr[mid-1]==target) hi = mid-1;
                else fp = mid; break;
            } else if (arr[mid]>target) {
                hi= mid-1;
            }
            else if (arr[mid]<target) lo = mid+1;
        }
        // finding the upper bound
        lo =0; hi = arr.length-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]== target){
                if(mid+1<arr.length && arr[mid]==arr[mid+1]){
                    lo=mid+1;
                }
                else{
                    lp = mid;
                    break;}
            }
            else if (arr[mid]>target){
                hi = mid-1;
            }
            else if (arr[mid]<target){
                lo = mid+1;
            }

        }
        ans[0] = fp;
        ans[1] = lp;
        return ans;

    }
}
