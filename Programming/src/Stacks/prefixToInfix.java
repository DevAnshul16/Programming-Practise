package src.Stacks;

import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i = str.length()-1 ; i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){// we have found the number , so push in val stack
                String st = "";
                val.push(st+ch);

            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                val.push('('+v1+ch+v2+')');

            }
        }

        System.out.println(val.peek());
    }
}
