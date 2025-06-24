package src.Linked_List;
// Finding the left middle value in a Linked List
public class leftMiddle {
public    int  left_Middle(Node head){
    if (head == null) {
        throw new IllegalArgumentException("List cannot be empty");
    }
    Node s = head;
    Node f = head;
    while( f.next!=null &&f.next.next!=null){
        s= s.next;
        f= f.next.next;
    }
    return s.val;
}

    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.insertAtEnd(60);
        leftMiddle lm = new leftMiddle();
        int result = lm.left_Middle(ll.head);
        System.out.println(result);

    }
}
