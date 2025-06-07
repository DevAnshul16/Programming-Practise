package Stacks;
 class Stack {
     int [] arr = new int[5];
     int idx = 0;
     void push(int x){
         if(isFull()){
             System.out.println("Cannot Insert"+" "+x);
             return;
         }
         arr[idx]= x;
         idx++;
     }
     int peek(){
         if(idx==0){ System.out.println("Empty Stack");
             return -1;}
         return arr[idx-1];
     }
     void display(){
         for(int i = 0 ; i<=idx-1; i++){
             System.out.println(arr[i]);
         }
     }
     int size(){
         return idx;
     }
     boolean isEmpty(){
         return idx == 0;
     }
     boolean isFull(){
         return arr.length == idx;
     }
     int pop(){
         if(isEmpty()) return -1;
         int top = arr[idx-1];
         arr[idx-1] = 0;
         idx--;
         return top;

     }
}

public class arrayImplement {
    public static void main(String[] args) {
        Stack st = new Stack(); // Original Size is 5
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());

    }
}
