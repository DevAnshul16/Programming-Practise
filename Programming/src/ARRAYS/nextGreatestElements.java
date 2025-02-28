package ARRAYS;

public class nextGreatestElements {
    public static void main(String[] args) {
        int[] arr ={12,44,55,7,32,90,97,99,10,1, 0};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1]= -1;
        // BRUTEFORCE METHOD
//        for (int i = 0 ; i<n-1;i++){
//            int mx = Integer.MIN_VALUE;
//            for (int j = i+1;j<n;j++){
//                mx = Math.max(mx,arr[j]);
//
//            }
//            ans[i]=mx;
//
//
//        }
//        for (int ele:ans
//             ) {
//            System.out.print(ele+" ");
//
//        }
        // OPTIMISED APPROACH
        int nge = arr[n-1];
        for (int i = n-2; i>=0; i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        for (int ele:ans
             ) {
            System.out.print(ele+" ");

        }


    }
}
