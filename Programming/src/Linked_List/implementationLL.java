package src.Linked_List;
class SLL{ //user defined data structure
   public Node head;
   public Node tail;
    int size;

    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if(head== null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }

    }
    public void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void insert(int idx , int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx ==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size|| idx<0){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i =1 ; i<=idx-1; i++){
            x = x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    public  int get(int idx){
        if(idx == size-1){
            return tail.val;
        }
        if(idx>=size-1 || idx<0){
            return -1;
        }
        Node temp = head;
        for(int i =1 ; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    public  void set(int idx, int val){
        if(idx == size-1){
            tail.val= val;
        }
        if(idx>=size-1 || idx<0){
            return;
        }
        Node temp = head;
        for(int i =1 ; i<=idx; i++){
            temp = temp.next;
        }
         temp.val = val;
    }

}
public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10); // add at the end
        list.insertAtEnd(20); // add at the end
        list.insertAtEnd(30); // add at the end
        list.insertAtEnd(40); // add at the end
        list.insertAtEnd(50); // add at the end
//        list.display();
        list.insert(5, 100);
        list.set(2, 15);
        list.display();


    }
}
