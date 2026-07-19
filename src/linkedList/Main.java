package linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedListimpl list = new LinkedListimpl();
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.InsertAtFirst(3);
        list.InsertAtLast(4);
        list.insertAtPosition(5, 3);
        list.removeAtFirst();
        list.removeAtLast();
        list.reverseList();
        list.printList();
        list.printList();


    }
}
