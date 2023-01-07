package Day81;

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
  void pop_back() {
    if(this.head != null) {
      if(this.head.next == this.head) {
        this.head = null;
      } else {
        Node temp = new Node();
        temp = this.head;
        while(temp.next.next != this.head)
          temp = temp.next;
        temp.next = this.head; 
        this.head.prev = temp;
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
public class doublycdeletionLL3 {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();
    MyList.push_back(100);
    MyList.push_back(200);
    MyList.push_back(300);
    MyList.push_back(400);
    MyList.PrintList(); 
    MyList.pop_back();
    MyList.PrintList(); 
  }
}

