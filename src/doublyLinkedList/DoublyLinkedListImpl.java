package doublyLinkedList;

public class DoublyLinkedListImpl implements DoublyLinkedList {

    private Node header;
    private Node lastNode;
    int size;

    public DoublyLinkedListImpl() {
        header = new Node(null);
        lastNode = header;
    }

    @Override
    public void printList() {
        if (size == 0) {
            System.out.println("List is Empty");
        } else {
            Node temp = header.next;
            System.out.println("\n----------------\n");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        System.out.println("lastNode :" + lastNode.data);
    }

    @Override
    public void printSize() {
        System.out.println("size = " + size);
    }

    @Override
    public void insertAtFirst(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else {
            Node temp = header.next;
            header.next = n;
            n.prev = header;
            n.next = temp;
            temp.prev = n;
        }

        size++;
    }

    @Override
    public void insertAtLast(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else {
            n.prev = lastNode;
            lastNode.next = n;
            lastNode = n;
        }

        size++;
    }

    @Override
    public void insertAtPosition(Integer data, Integer p) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else if (p < size) {
            int inc = 1;
            Node temp = header.next;
            while (temp.next != null && inc != p) {
                temp = temp.next;
                inc++;
            }
            temp.prev.next = n;
            n.prev = temp.prev;
            temp.prev = n;
            n.next = temp;
        } else {
            insertAtLast(data);
        }

        size++;
    }

    @Override
    public void removeAtFirst() {
        if (size == 0)
            System.out.println("List is Empty");
        else if (size != 0) {
            header = header.next;
            header.prev = null;
            size--;
        }
    }

    @Override
    public void removeAtLast() {
        if (size == 0) {
            System.out.println("List is Empty");
        } else if (header == lastNode) {
            header = null;
            lastNode = null;
            System.out.println("List is Empty now");
            size--;
        } else {
            lastNode = lastNode.prev;
            lastNode.next = null;
        }
    }

    @Override
    public void reverseList() {
        if (size == 0) {
            System.out.println("List is Empty");
        } else if (size == 1) {
            System.out.println(header.data);
        } else {
            Node temp = lastNode;
            while (temp.prev != null) {
                System.out.println("Data : " + temp.data);
                temp = temp.prev;
            }
        }
    }
}
