package basicSorting;
//Selection sort using shifting max element to left side.
public class selectionSort2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,0,1};
        for(int i = 0 ; i < arr.length-1;i++){
            int maxvalue = Integer.MAX_VALUE;
            int maxindx = arr.length-1;
            for(int j = i ; j<arr.length; j++){
                if(arr[j]<maxvalue){
                    maxvalue  = arr[j];
                    maxindx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[maxindx];
            arr[maxindx] = temp;
        }
        for (int ele: arr
        ) {
            System.out.print(ele+" ");

        }

    }
}
