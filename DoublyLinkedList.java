public class DoublyLinkedList {

    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    class Node {
        public String data;
        public Node next;
        public Node prev;

        public Node(String data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void addNode(String data) { // adding to the end of the list
        Node node = new Node(data);
        // if there is not a tail to the list, the list is empty
        if (tail == null) {
            head = node; // head must be the same as tail if there's only one node in the list
            tail = node; // setting the end equal to the new node
        }
        // if there is a tail, only the tail must be set to the new node
        else{
            tail.next = node; // current tail node is set before the new node
            node.prev = tail; // new node's prev is set to point to the previous tail
            tail = node; // sets the tail in the class to reference the new node
        }
    }

    public void resolveParenthesis() {

    }

    public void resolveExponent() {

    }
}
