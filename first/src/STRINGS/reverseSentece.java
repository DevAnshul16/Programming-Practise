package STRINGS;


public class reverseSentece {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anshul Thakur is an App developer");
        String s = "ANSHUL";

        int x = 0 ;
        int y = 0;
        int n = sb.length();
        while(y<n){
            if(sb.charAt(y)!= ' ') y++;
            else {
                swap(sb, x, y-1);
                x= y+1;
                y=x;
            }
             // extra using this function to reverse last word !!
        }
        swap(sb, x,y-1);

        System.out.println(sb);
        }

    public static void swap(StringBuilder sb, int x , int y){
       while (x<=y){
           char temp = sb.charAt(x);
           sb.setCharAt(x, sb.charAt(y));
           sb.setCharAt(y, temp);
           x++ ; y--;
       }
    }
}
