package Recursion;

public class countSay {
    public static void counting(int i , int j , String s){
        if(j ==s.length()){
            System.out.println(s);
            return;
        }
        if(s.charAt(j)==s.charAt(i)){
            counting(i,j+1,s);
        }
        else{
            counting(i=j,j,s+i);
        }
    }
    public static void main(String[] args) {
        counting(0,0,"aaaabbbb");
    }
}
