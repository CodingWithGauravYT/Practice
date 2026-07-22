package doublyLinkedList;

public interface DoublyLinkedList {

    void printList();

    void printSize();

    void insertAtFirst(Integer data);

    void insertAtLast(Integer data);

    void insertAtPosition(Integer data, Integer p);

    void removeAtFirst();

    void removeAtLast();

    void reverseList();
}
