public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // test cases
        doublyLinkedList.addNode("d");
        doublyLinkedList.addNode("4");
        doublyLinkedList.addNode("/");
        doublyLinkedList.addNode("2");
        doublyLinkedList.addNode("*");
        doublyLinkedList.addNode("5");
        doublyLinkedList.addNode("**");
        doublyLinkedList.addNode("2");
        doublyLinkedList.addNode("k");

        DoublyLinkedList.Node currentNode = doublyLinkedList.head;
        while (currentNode != null) {
            doublyLinkedList.resolveExponent();
            currentNode = currentNode.next;
        }
        DoublyLinkedList.Node currentNode1 = doublyLinkedList.head;
        while (currentNode1 != null) {
            doublyLinkedList.resolveMultiplyDivide();
            currentNode1 = currentNode1.next;
        }
        DoublyLinkedList.Node currentNode2 = doublyLinkedList.head;
        while (currentNode2 != null) {
            System.out.println(currentNode2.data);
            currentNode2 = currentNode2.next;
        }
    }
}