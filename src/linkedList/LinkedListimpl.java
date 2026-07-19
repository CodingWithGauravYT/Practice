package linkedList;

public class LinkedListimpl implements LinkList {

    private Node header;
    private Node lastNode;
    int size;

    public LinkedListimpl() {
        header = new Node(null);
        lastNode = header;
    }

    @Override
    public void InsertAtFirst(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else {
            Node temp = header.next;
            header.next = n;
            n.next = temp;
        }

        size++;
    }

    @Override
    public void InsertAtLast(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else {
            lastNode.next = n;
            lastNode = n;
        }

        size++;
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
    public void insertAtPosition(Integer data, Integer p) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else if (p < size) {
            int inc = 1;
            Node temp = header.next;
            Node prev = header;
            while (temp.next != null && inc != p) {
                prev = temp;
                temp = temp.next;
                inc++;
            }
            prev.next = n;
            n.next = temp;
        } else {
            InsertAtLast(data);
        }

        size++;
    }

    @Override
    public void removeAtFirst() {
        if (size == 0)
            System.out.println("List is Empty");
        else if (size != 0) {
            header = header.next;
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
            Node temp = header;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            lastNode = temp;
            size--;
        }
    }

    @Override
    public void reverseList() {
        if (size == 0) {
            System.out.println("List is Empty");
        } else if (size == 1) {
            System.out.println(header.data);
        } else {
            Node current = header.next;
            Node prev = null;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;

            }
            header.next = prev;
        }
    }
}
