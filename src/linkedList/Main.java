package linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.InsertAtFirst(3);
        list.InsertAtLast(4);
        list.insertAtPosition(5,3);
        list.printList();

    }
}
