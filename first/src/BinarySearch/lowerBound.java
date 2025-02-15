package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int [] arr = {10, 23, 46, 46, 91, 98, 140, 222};
        int target = 46;
        int lb = arr.length;
        int lo= 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid-1;
            }
            else {
                lo= mid+1;
            }
        }
        System.out.println(lb);


    }
}
