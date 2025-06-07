package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayReverse(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        Stack<Integer> st2 = new Stack<>();
//        while (!st.isEmpty()) {
//            int top = st.pop();
//            System.out.print(top + " ");
//            st2.push(top);
//        }
//        System.out.println();
//        System.out.println("After Reversing the Elements");
//        while (!st2.isEmpty()) {
//            System.out.print(st2.pop() + " ");
//        }
        displayReverse(st);
    }
}
