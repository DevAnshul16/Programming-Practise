package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8,9,10,22,34,35,67,78};
        int hi = arr.length-1;
        int lo = 0 ;
        int target = 33;
        int index = 0 ;
        boolean flag  = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target==arr[mid]){
                flag = true;
                index = mid;
                break;

            } else if (target<arr[mid]) {
                hi = mid-1;

            }
            else if (target>arr[mid]){
                lo=mid+1;

            }
        }
        if(flag == true){
            System.out.println("True at" +" "+ index);
        }
        else System.out.println("False");
    }
}
