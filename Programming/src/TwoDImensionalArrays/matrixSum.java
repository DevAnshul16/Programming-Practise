package TwoDImensionalArrays;
// MATRICES SUM WITHOUT USING EXTRA ARRAY
public class matrixSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]  arr2 = {{10,11,12},{13,14,15},{16,17,18}};
        int m = arr.length;
        int n = arr2[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]= arr[i][j] + arr2[i][j];
            }

        }
        for (int[] ele:arr) {
            for (int a:ele
                 ) {
                System.out.print(a + " ");

            }
            System.out.println();

        }

    }
}
