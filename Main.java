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
        doublyLinkedList.addNode("+");
        doublyLinkedList.addNode("4");

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
            doublyLinkedList.resolveAdditionSubtraction();
            currentNode2 = currentNode2.next;
        }
        DoublyLinkedList.Node currentNode3 = doublyLinkedList.head;
        while (currentNode3 != null) {
            System.out.println(currentNode3.data);
            currentNode3 = currentNode3.next;
        }
    }
}