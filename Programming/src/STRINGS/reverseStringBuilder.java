package STRINGS;
// reversing a string builder without using inbuilt functions
public class reverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anshul");
        int x = 0 ;
        int y = sb.length()-1;
            while(x<y){
                swap(sb,x,y);
                x++;
                y--;
            }

        System.out.println(sb);


    }
    public static void swap(StringBuilder sb, int x , int y){
        char temp = sb.charAt(x);
        sb.setCharAt(x, sb.charAt(y));
        sb.setCharAt(y, temp);

    }
}
