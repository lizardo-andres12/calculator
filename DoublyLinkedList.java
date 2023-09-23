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
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals("**")) {

                // must convert the String values into doubles
                double product = Math.pow(Double.parseDouble(currentNode.prev.data), Double.parseDouble(currentNode.next.data));
                Node node = new Node(String.valueOf(product)); // create a new node with the value of the product

                // checking following cases: prev and next of "**" are head and tail, prev of "**" is head, next of "**" is tail
                if (currentNode.prev.prev == null && currentNode.next.next == null) {
                    head = node; // overwrite head
                    tail = node; // overwrite tail
                }
                else if (currentNode.prev.prev == null) {
                    head = node; // overwrite head
                    head.next = currentNode.next.next; // set head's next pointer to the node after the exponent
                }
                else if (currentNode.next.next == null) {
                    tail = node; // overwrite tail
                    tail.prev = currentNode.prev.prev; // set tail's prev pointer to the node before the multiplicand
                }
                else {
                    node.prev = currentNode.prev.prev; // set the new node's prev value
                    node.next = currentNode.next.next; // set the new node's next value
                    currentNode.prev.prev.next = node; // set node's prev to point to node
                    currentNode.next.next.prev = node; // set node's next to point to node
                }
            }
            currentNode = currentNode.next;
        }
    }
}
