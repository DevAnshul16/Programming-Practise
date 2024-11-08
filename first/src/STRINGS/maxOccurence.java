package STRINGS;
// Given a String consisting of lowercase characters, print the character which is occuring most of the time!!
public class maxOccurence {
    public static void main(String[] args) {
        String str = "abaaaacrmnopaappbbb";
        int[] arr = new int[26]; // array to store 26 alphabets
        for(int i = 0 ; i< str.length(); i++){
            char ch = str.charAt(i);
            arr[(int)(ch)-97]++;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0 ; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The max occurence in the given string is the" + " "+ (char)(97+index) +" "+ max +  "times");
    }
}
