package src.Stacks;

import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";

                Stack<String> val = new Stack<>();
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){// we have found the number , so push in val stack
                String st = "";
                val.push(st+ch);

            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                val.push("("+v1+ch+v2+")");


            }
        }

        System.out.println(val.peek());
    }
}
