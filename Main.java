public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // test cases
        doublyLinkedList.addNode("String");
        doublyLinkedList.addNode("f");
        doublyLinkedList.addNode("1234");

        DoublyLinkedList.Node currentNode = doublyLinkedList.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}