package src.Queues;
class Queue {
    int r = -1;
    int f = -1;
    int size=0;
    int [] arr = new int[5];
    public void add(int val){
        if(r==arr.length-1){
            System.out.println("Overflow Condition !!");
            return;
        }
        if(f==-1 && r ==-1){
            f= 0 ;
            r=0;
            arr[r] = val;
        }
        else {
            arr[++r] = val;
        }
        size++;

    }
    public int remove(){
        if(size==0){
            System.out.println("Underflow Condition");
            return -1;
        }
        int val = arr[f++];

        size--;
        return val;
    }
    public int peek(){
        if(size==0){
            System.out.println("Underflow condition");
            return -1;
        }
        return arr[f];
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void display(){
        if(size==0){
            System.out.println("Underflow condition");
            return ;
        }else {
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i]);
                if (i < r) System.out.print(",");
            }
            System.out.println();
        }
    }
}

public class arrayImplement {
    public static void main(String[] args) {
        Queue qe = new Queue();
        System.out.println(qe.isEmpty());
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println(qe.size);
        qe.display();
        System.out.println(qe.remove());
        qe.display();
        System.out.println(qe.size);
        System.out.println(qe.peek());

    }
}
