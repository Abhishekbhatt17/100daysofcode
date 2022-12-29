package Day72;

class Node {
    int data;
    Node next;
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
    if(head == null) {
      head = newNode;
      newNode.next = head;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != head)
        temp = temp.next;
      temp.next = newNode;
      newNode.next = head;
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
public class circularinsertionLL3 {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();
    MyList.push_back(100);
    MyList.push_back(200);
    MyList.push_back(300);
	MyList.push_back(400);
	MyList.push_back(500);
    MyList.PrintList(); 
  }
}