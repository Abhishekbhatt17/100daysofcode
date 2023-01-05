package Day79;

class Node {
    int data;
    Node next;
    Node prev;
};

class LinkedList {
  Node head;

  LinkedList(){
    head = null;
  }
  void push_back(int newElement) {
    Node newNode = new Node();
    newNode.data = newElement;
    newNode.next = null; 
    newNode.next = null;
    if(head == null) {
      head = newNode;
      newNode.next = head;
      newNode.prev = head;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != head)
        temp = temp.next;
      temp.next = newNode;
      newNode.next = head;
      newNode.prev = temp;
      head.prev = newNode;
    }    
  }
  void pop_front() {
    if(this.head != null) {
      if(this.head.next == this.head) {
        this.head = null;
      } else {
        Node temp = this.head;
        while(temp.next != this.head) {
          temp = temp.next;
        }
        this.head = this.head.next;
        this.head.prev = temp;
        temp.next = this.head; 
      }
    }
  }
  void PrintList() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(true) {
        System.out.print(temp.data + " ");
        temp = temp.next;
        if(temp == this.head)
          break;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }     
};
public class doublycdeletionLL {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();

    MyList.push_back(10);
    MyList.push_back(20);
    MyList.push_back(30);
    MyList.push_back(40);
    MyList.PrintList();
    MyList.pop_front();
    MyList.PrintList(); 
  }
}
