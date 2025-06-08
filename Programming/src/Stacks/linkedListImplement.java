package Stacks;

class Node{
    int val;
    Node next;
    Node (int val) {
        this.val = val;
        this.next = null;
    }
}
class StackLL{
    Node head = null;
    int size = 0;
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int size(){
        return size;
    }
    int pop(){
        if(head == null){
            System.out.println("Empty Stack");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    int peek(){
        if(head== null) return -1;
        return head.val;
    }
    boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
    void display(){
        displayRec(head);
    }
    void displayRec(Node h){
        if(h==null) return;
        displayRec(h.next);
        System.out.println(h.val);
    }
}

public class linkedListImplement {

    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(22);
        st.push(23);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size);
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st.isEmpty());

    }
}
