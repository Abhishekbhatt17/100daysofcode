package Day77;

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
  void push_at(int newElement, int position) { 
    Node newNode = new Node(); 
    newNode.data = newElement;
    newNode.next = null;
    Node temp = head;
    int NoOfElements = 0;
    if(temp != null) {
      NoOfElements++;
      temp = temp.next;
    }
    while(temp != head) {
      NoOfElements++;
      temp = temp.next;
    }

    if(position < 1 || position > (NoOfElements+1)) {
      System.out.print("\nInvalid position.");
    } else if (position == 1) {
      if(head == null) {
        head = newNode;
        head.next = head;
        head.prev = head;
      } else {
        while(temp.next != head) {
          temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
      }
    } else {

      temp = head;
      for(int i = 1; i < position-1; i++)
        temp = temp.next;
      newNode.next = temp.next;
      newNode.next.prev = newNode;
      newNode.prev = temp;
      temp.next = newNode;  
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
public class doublycinsertionLL2 {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();
    MyList.push_back(10);
    MyList.push_back(20);
    MyList.push_back(30);
    MyList.PrintList(); 
    MyList.push_at(100, 2);
    MyList.PrintList();
    MyList.push_at(200, 1);
    MyList.PrintList(); 
  }
}
