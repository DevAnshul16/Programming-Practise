package TwoDImensionalArrays;

public class transposeMatrix {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        int [] [] arr1 = new int[n][m];   // if original is MxN then transpose will be NxM
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                arr1[i][j]= arr[j][i]; wrong way to do that
                arr1[j][i] = arr[i][j]; // correct way !


            }
        }
        for (int[] ele: arr1) {
            for (int a :ele
                 ) {
                System.out.print(a+" ");

            }
            System.out.println();

        }

    }
}
