package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class pushAtRandom { // push element into the stack at bottom/random index
    public static void main(String[] args) {
        /*
                                              INSERT AT BOTTOM
        Empty the stack to temp stack
        insert the new element
        copy from temp to original
         */
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(3); // insert at bottom
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
                                          //INSERT AT INDEX
        st.push(1);
        st.push(2);
        st.push(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index to be inserted"+"<"+st.size());
        int idx = sc.nextInt();
        System.out.println("enter the element to be inserted");
        int ele = sc.nextInt();
        if(idx>st.size()) System.out.println("Invalid ");
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(ele);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
