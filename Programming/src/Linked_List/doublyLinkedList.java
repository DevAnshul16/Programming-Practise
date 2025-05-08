package Linked_List;

import static Linked_List.dNode.display;
import static Linked_List.dNode.reverseDisplay;

class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
    public static void display(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
    public static void reverseDisplay(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.prev;
        }

    }
}
class DLL{
    int size;
    dNode head;
    dNode tail;
    void display(){
        dNode temp = head;
        while(temp !=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size ==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtIndex(int idx, int val){
        if(idx==0){ insertAtHead(val); return;}
        if (idx==size){ insertAtTail(val); return;}
        if(idx>size || idx <size) {
            System.out.println("Invalid");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i = 1; i<=idx-1;i++){
            x=x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }
}

public class doublyLinkedList {

    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
//        reverseDisplay(d);
        DLL dll = new DLL();
        dll.insertAtTail(10);
        dll.insertAtHead(20);
        dll.display();





    }
}
