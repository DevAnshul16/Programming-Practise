package Linked_List;

public class shallowCopyOfANode {
    public static void printLinkedList(Node head){ // Recursive Method to print the nodes
        if(head == null) return;
        printLinkedList(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10); // Head Node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        Node temp =a ; // Shallow Copy of a
//        while(temp!= null){                   // normal method to print
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
        printLinkedList(a);
    }
}
