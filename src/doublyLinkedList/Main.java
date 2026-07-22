package doublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedListImpl list = new DoublyLinkedListImpl();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtLast(4);
        list.insertAtPosition(5, 3);
        list.reverseList();
        list.removeAtFirst();
        list.removeAtLast();
        list.printList();
    }
}
