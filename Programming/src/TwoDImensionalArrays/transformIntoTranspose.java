package TwoDImensionalArrays;

public class transformIntoTranspose {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6}, {7,8,9}};
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <i ; j++) {
                swap(arr, i,j);
            }
        }
        print(arr);
    }
    public static void swap(int[][] arr, int i , int j){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]= temp;
    }
    public static void print(int[][] arr){
        int m = arr.length;
        for (int[] ele:arr) {
            for (int a :ele
                 ) {
                System.out.print(a+" ");

            }
            System.out.println();
        }
    }

}
