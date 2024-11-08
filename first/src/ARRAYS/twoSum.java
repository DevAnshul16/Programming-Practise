package ARRAYS;


import java.util.ArrayList;
import java.util.Scanner;

//LEETCODE 1
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        for (int a:arr) {
            for (int b:arr) {
                if ((a+b) == target){
                    System.out.println((a) + ""+(b));
                    break;
                }


            }

        }
    }
}
