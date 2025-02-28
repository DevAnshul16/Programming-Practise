package STRINGS;

public class findVowels {
    public static void main(String[] args) {
        String str = "aeiouAEIOU";
        str.toLowerCase();
        System.out.println(str);
        int count =0 ;
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch)) count++;
        }
        System.out.println(count);

    }
    public static boolean isVowel(char ch){
        if(ch== 'a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch== 'A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}
