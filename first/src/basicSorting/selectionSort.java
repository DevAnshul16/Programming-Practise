package basicSorting;
// finds the minimum value and place it at it's right position !
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,0,1};
        for(int i = 0 ; i < arr.length-1;i++){
            int minvalue = Integer.MAX_VALUE;
            int minindx = -1;
            for(int j = i ; j< arr.length; j++){
                if(arr[j]<minvalue){
                    minvalue  = arr[j];
                    minindx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = temp;
        }
        for (int ele: arr
             ) {
            System.out.print(ele+" ");

        }

    }

}

