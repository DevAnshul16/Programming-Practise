package basicSorting;

public class sortingCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int [] arr1 = {1,2,4,3,5,2};
        System.out.println(sorting(arr));
        System.out.println(sorting(arr1));


    }

    static boolean sorting(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
