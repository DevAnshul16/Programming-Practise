package Stacks;

import java.util.Stack;

public class copyStackSameOrder { // copy the stack into another stack into same order
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        Stack<Integer> temp = new Stack<>();
        while(!st1.isEmpty()){
            temp.push(st1.pop());
        }
        Stack<Integer> st2 = new Stack<>();
        while (!temp.isEmpty()){
            st2.push(temp.pop());
        }
        while (!st2.isEmpty()){
            System.out.println(st2.pop());
        }


    }
}
