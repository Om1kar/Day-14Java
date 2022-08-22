package LinkList.UC2;

public class LinkedLists {
    public static void main(String[] arg) {

        LinkedLists List = new LinkedLists();

        List.addnode(56);
        List.addnode(30);
        List.addnode(70);

        List.display();

    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }

    public void display() {

        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Sequence of linked list: ");
        while (current != null) {

            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addnode(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtStart(int newdata) {

        Node newNode = new Node(newdata);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;

            head = newNode;
            head.next = temp;
        }
    }
}
