package Day68;

public class DoublydeletionLL2
    {  
         class Node{  
            int data;  
            Node prev;  
            Node next;  
            public Node(int data) {  
                this.data = data;  
            }  
        }  
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "–>");
            temp = temp.next;
        }
        System.out.println("END");
    }
    Node head, tail = null;  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
         if(head == null) {  
            head = tail = newNode;  
            head.prev = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }
    public void deletenth(int n) {  
         if(head == null) {  
            return;  
        }  
        else {  
            Node current = head;  
  
              int pos =n;  
  
            for(int i = 1; i < pos; i++){  
                current = current.next;  
            }  
  
            if(current == head) {  
                head = current.next;  
            }  
             else if(current == tail) {  
                tail = tail.prev;  
            }  
            else {  
                current.prev.next = current.next;  
                current.next.prev = current.prev;  
            }  
             current = null;  
        }  
    }  
     void print() {  
        Node curr = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }
        while(curr != null) 
           {  
            System.out.print(curr.data + " ");  
            curr = curr.next;  
            }  
        System.out.println();  
        }  
    public static void main(String[] args) {  
        DoublydeletionLL2 dList = new DoublydeletionLL2(); 
        dList.addNode(10);  
        dList.addNode(20);  
        dList.addNode(30);
        dList.addNode(40);
        dList.addNode(50);
        System.out.println("Initial Doubly Linked List: "); 
        dList.print();
        dList.deletenth(2);
        System.out.println("Doubly Linked List after Deletion from nth Position: "); 
        dList.print();  
    }  
}