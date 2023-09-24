public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // test cases

        doublyLinkedList.addNode("e");
        doublyLinkedList.addNode("2");
        doublyLinkedList.addNode("+");
        doublyLinkedList.addNode("(");
        doublyLinkedList.addNode("2");
        doublyLinkedList.addNode("+");
        doublyLinkedList.addNode("2");
        doublyLinkedList.addNode("*");
        doublyLinkedList.addNode("3");
        doublyLinkedList.addNode(")");
        doublyLinkedList.addNode("*");
        doublyLinkedList.addNode("2");
        doublyLinkedList.addNode("g");

        DoublyLinkedList.Node currentNode = doublyLinkedList.head;
        while (currentNode != null) {
            doublyLinkedList.resolveParenthesis();
            currentNode = currentNode.next;
        }
        DoublyLinkedList.Node currentNodeE = doublyLinkedList.head;
        while (currentNodeE != null) {
            doublyLinkedList.resolveExponent();
            currentNodeE = currentNodeE.next;
        }
        DoublyLinkedList.Node currentNode1 = doublyLinkedList.head;
        while (currentNode1 != null) {
            doublyLinkedList.resolveMultiplyDivide();
            currentNode1 = currentNode1.next;
        }
        DoublyLinkedList.Node currentNode2 = doublyLinkedList.head;
        while (currentNode2 != null) {
            doublyLinkedList.resolveAddSubtract();
            currentNode2 = currentNode2.next;
        }
        DoublyLinkedList.Node currentNode3 = doublyLinkedList.head;
        while (currentNode3 != null) {
            System.out.print(currentNode3.data);
            currentNode3 = currentNode3.next;
        }
    }
}