package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetInteger {
    static List<List<Integer>>arr;
    public static void helper(int i , int[] nums, ArrayList<Integer>ans){
        if(i == nums.length){
            ArrayList<Integer>list = new ArrayList<>(ans);

            arr.add(list);
            return;
        }
        helper(i+1 , nums, ans);
        ans.add(nums[i]);
        helper(i+1, nums, ans);
        ans.remove(ans.size()-1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0 , nums, ans);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(subsets(arr));
;
    }
}
