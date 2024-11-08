package TwoDImensionalArrays;

public class rotateMatrix90 {
    public static void main(String[] args) {
        int [][] arr = {{10,20,30},{40,50,60},{70,80,90}};
        rotate(arr);
        for (int [] ele:arr) {
            for (int a:ele) {
                System.out.print(a+" ");

            }
            System.out.println();


        }

    }
    public static void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // for reversing the row of transposed matrix

        for(int i = 0 ; i<m;i++){
            int a =0 ;
            int b=m-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a]= arr[i][b];
                arr[i][b]= temp;
                a++;
                b--;
            }
        }
    }

}