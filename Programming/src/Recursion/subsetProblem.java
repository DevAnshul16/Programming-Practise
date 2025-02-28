package Recursion;
// Print the subsets of String with unique characters
public class subsetProblem {
    public static void subsets(String str, String add, int i){
        if(i == str.length()){
            System.out.println(add);return;
        }
        char ch = str.charAt(i);
        subsets(str, add+ch, i+1);
        subsets(str, add, i+1);
    }
    public static void main(String[] args) {
        String a = "Anshul";
        subsets(a,"", 0);

    }

}
