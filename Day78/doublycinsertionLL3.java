package Day78;

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

public class doublycinsertionLL3 {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();

    MyList.push_back(10);
    MyList.push_back(20);
    MyList.push_back(30);
    MyList.push_back(40);
    MyList.push_back(50);
    MyList.push_back(60);
    MyList.PrintList(); 
  }
}

