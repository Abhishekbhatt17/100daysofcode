package Day76;


class doublycinsertionLL {

    static Node start;

    static class Node {
        int data;
        Node next;
        Node prev;
    };

    static void insertEnd(int value) {

        if (start == null) {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            start = new_node;
            return;
        }

        Node last = (start).prev;

        Node new_node = new Node();
        new_node.data = value;

        new_node.next = start;

        (start).prev = new_node;

        new_node.prev = last;

        last.next = new_node;
    }

    static void insertBegin(int value) {
        if (start == null) {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            start = new_node;
            return;
        }

        Node last = (start).prev;

        Node new_node = new Node();
        new_node.data = value;

        new_node.next = start;
        new_node.prev = last;

        last.next = (start).prev = new_node;

        start = new_node;
    }

    static void display() {
        Node temp = start;

        System.out.printf("\nTraversal in forward direction \n");
        while (temp.next != start) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);

        System.out.printf("\nTraversal in reverse direction \n");
        Node last = start.prev;
        temp = last;
        while (temp.prev != last) {
            System.out.printf("%d ", temp.data);
            temp = temp.prev;
        }
        System.out.printf("%d ", temp.data);
    }

    public static void main(String[] args) {

        insertEnd(7);
        insertBegin(3);
        insertBegin(4);
        insertEnd(6);
        insertEnd(9);
        insertBegin(8);
        insertBegin(5);
        System.out.printf("Created circular doubly linked list is: ");
        display();
    }
}
