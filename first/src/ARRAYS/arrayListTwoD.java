package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class arrayListTwoD {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>(3); // syntax for creating a twoD arraylist (List inside a list)
        List<Integer>arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        List<Integer>arr2 = new ArrayList<>();
        List<Integer>arr3 = new ArrayList<>(); List<Integer>arr4= new ArrayList<>(); arr4.add(60);
        arr2.add(40); arr2.add(50);
        arr.add(arr1); arr.add(arr2); arr.add(arr3); arr.add(arr4);
//        for (int i = 0; i <arr.size(); i++) {
//            System.out.println(arr.get(i));
//
//        }
        // another way to print 
        for(int i = 0 ; i < arr.size(); i++){
            List<Integer> l = arr.get(i);
            for (int j = 0; j <l.size(); j++) {
                System.out.print(l.get(j)+" ");
                
            }
            System.out.println();

        }
    }
}
