package Recursion;

import java.util.ArrayList;
import java.util.List;

// Print all the increasing sequences of length k from first n natural numbers.
public class incSequence {
    static List<List<Integer>>arr;
    public static void helper(int i , int nums,int k ,ArrayList<Integer> ans){
        if( ans.size()==k){
            ArrayList<Integer>list = new ArrayList<>(ans);
            arr.add(list);
            return;
        }
        if(i>nums) return;
        helper(i+1,nums,k,ans);
        ans.add(i);
        helper(i+1, nums,k, ans);
        ans.remove(ans.size()-1);
    }
    public static List<List<Integer>> subsets(int nums,int k) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(1 , nums, k , ans);
        return arr;
    }
    public static void main(String[] args) {

        System.out.println(subsets(6,4));
    }
}
