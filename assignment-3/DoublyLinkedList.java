public class DoublyLinkedList {

    private Node head;
    private Node tail;


    public Node searchHead(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public void addFirstNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head=tail=newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addNode(int data, Node previous) {
        if (head == null || previous == null) {
            addFirstNode(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = previous.next;
            newNode.prev = previous;

            // yeni node'dan sonraki elementi ayarlama.
            if (previous.next != null) {
                previous.next.prev = newNode;
            } else {
                tail = newNode; // previous tail ise
            }

            previous.next = newNode;
        }
    }

    //because java has (GC) garbage collector
    public void deleteElement(Node data) {

        if (data.prev != null)
            data.prev.next = data.next;
        else
            head = data.next; // head siliniyor

        if (data.next != null)
            data.next.prev = data.prev;
        else
            tail = data.prev; // tail siliniyor
    }

    public void addLastNode(int data) {

        if(head == null) {
            addFirstNode(data);
        }
        else{
            Node newNode = new Node(data);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

}