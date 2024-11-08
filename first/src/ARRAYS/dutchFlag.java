package ARRAYS;

public class dutchFlag {
    public static void main(String[] args) {
        int [] arr = {1,0,1,2,1,1,2,0,0,1,2,2,1,1,0};
        sortColors(arr);
        for (int ele:arr
             ) {
            System.out.print(ele+" ");

        }

    }
    public static void sortColors(int[] nums) {
        int low = 0, mid =0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid]=temp;
                low++;
                mid++;

            }else if (nums[mid]==1){
                mid++;

            }else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }

    }
}
