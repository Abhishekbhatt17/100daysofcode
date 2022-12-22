package Day66;

public class DoublyLLinsertion2 {  

    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
 
    Node head, tail = null;  
  
    public void addAtEnd(int data) {  
        Node newNode = new Node(data);  

        if(head == null) {  
            head = tail = newNode;   
            head.previous = null;  
            tail.next = null;  
        }  

        else {  
  
            tail.next = newNode;  
            newNode.previous = tail;    
            tail = newNode;  
            tail.next = null;  
        }  
    }  

    public void display() {  
       
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding a node to the end of the list: ");  
        while(current != null) {   
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
    public static void main(String[] args) {  
        DoublyLLinsertion2 dList = new DoublyLLinsertion2();  
         
        dList.addAtEnd(10);  
        dList.display();  
          
        dList.addAtEnd(25);  
        dList.display();  
        
        dList.addAtEnd(33);  
        dList.display();  
       
        dList.addAtEnd(94);  
        dList.display();  
        
        dList.addAtEnd(75);  
        dList.display();  
    }  
}  