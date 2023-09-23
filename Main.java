public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // test cases
        doublyLinkedList.addNode("5");
        doublyLinkedList.addNode("**");
        doublyLinkedList.addNode("2");

        DoublyLinkedList.Node currentNode = doublyLinkedList.head;
        while (currentNode != null) {
            doublyLinkedList.resolveExponent();
            currentNode = currentNode.next;
        }
        DoublyLinkedList.Node currentNode1 = doublyLinkedList.head;
        while (currentNode1 != null) {
            System.out.println(currentNode1.data);
            currentNode1 = currentNode1.next;
        }
    }
}