public class DoublyLinkedList {
    // calculator methods written in this class
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
                    head.prev = null; // reset prev to null
                    tail = node; // overwrite tail
                    tail.next = null; // reset prev to null
                }
                else if (currentNode.prev.prev == null) {
                    head = node; // overwrite head
                    head.next = currentNode.next.next; // set head's next pointer to the node after the exponent
                    currentNode.next.next.prev = head; // set head next to point back at head
                }
                else if (currentNode.next.next == null) {
                    tail = node; // overwrite tail
                    tail.prev = currentNode.prev.prev; // set tail's prev pointer to the node before the multiplicand
                    currentNode.prev.prev.next = tail; // set tail prev to point back at tail
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

    public void resolveMultiplyDivide() {
        Node currentNode = head;
        while (currentNode != null) {
            // check multiplication
            if (currentNode.data.equals("*")) {
                // must convert the String values into doubles
                double product = (Double.parseDouble(currentNode.prev.data) * Double.parseDouble(currentNode.next.data));
                Node nodeP = new Node(String.valueOf(product)); // create a new node with the value of the product

                // checking following cases: prev and next of "*" are head and tail, prev of "*" is head, next of "*" is tail
                if (currentNode.prev.prev == null && currentNode.next.next == null) {
                    head = nodeP; // overwrite head
                    head.prev = null; // reset prev to null
                    tail = nodeP; // overwrite tail
                    tail.next = null; // reset prev to null
                }
                else if (currentNode.prev.prev == null) {
                    head = nodeP; // overwrite head
                    head.next = currentNode.next.next; // set head's next pointer to the node after the multiplier
                    currentNode.next.next.prev = head; // set head next to point back at head
                }
                else if (currentNode.next.next == null) {
                    tail = nodeP; // overwrite tail
                    tail.prev = currentNode.prev.prev; // set tail's prev pointer to the node before the multiplicand
                    currentNode.prev.prev.next = tail; // set tail prev to point back at tail
                }
                else {
                    nodeP.prev = currentNode.prev.prev; // set the new node's prev value
                    nodeP.next = currentNode.next.next; // set the new node's next value
                    currentNode.prev.prev.next = nodeP; // set node's prev to point to node
                    currentNode.next.next.prev = nodeP; // set node's next to point to node
                }
            }
            // check division
            if (currentNode.data.equals("/")) {
                // must convert the String values into doubles
                double quotient = (Double.parseDouble(currentNode.prev.data) / Double.parseDouble(currentNode.next.data));
                Node nodeQ = new Node(String.valueOf(quotient)); // create a new node with the value of the quotient

                // checking following cases: prev and next of "/" are head and tail, prev of "/" is head, next of "/" is tail
                if (currentNode.prev.prev == null && currentNode.next.next == null) {
                    head = nodeQ; // overwrite head
                    head.prev = null; // reset prev to null
                    tail = nodeQ; // overwrite tail
                    tail.next = null; // reset prev to null
                }
                else if (currentNode.prev.prev == null) {
                    head = nodeQ; // overwrite head
                    head.next = currentNode.next.next; // set head's next pointer to the node after the divisor
                    currentNode.next.next.prev = head; // set head next to point back at head
                }
                else if (currentNode.next.next == null) {
                    tail = nodeQ; // overwrite tail
                    tail.prev = currentNode.prev.prev; // set tail's prev pointer to the node before the dividend
                    currentNode.prev.prev.next = tail; // set tail prev to point back at tail
                }
                else {
                    nodeQ.prev = currentNode.prev.prev; // set the new node's prev value
                    nodeQ.next = currentNode.next.next; // set the new node's next value
                    currentNode.prev.prev.next = nodeQ; // set node's prev to point to node
                    currentNode.next.next.prev = nodeQ; // set node's next to point to node
                }
            }
            currentNode = currentNode.next;
        }
    }
}
