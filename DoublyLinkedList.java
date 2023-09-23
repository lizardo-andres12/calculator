public class DoublyLinkedList {

    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    class Node {
        public double data;
        public char operand;
        public Node next;
        public Node prev;

        public Node(double data) {
            this.data = data;
            prev = null;
            next = null;
        }

        public Node(char operand) {
            this.operand = operand;
            prev = null;
            next = null;
        }
    }
}
