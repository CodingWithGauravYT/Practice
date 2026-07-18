package linkedList;

public class LinkedList {

    private Node header;
    private Node lastNode;
    int size;

    public LinkedList() {
        header = new Node(null);
        lastNode = header;
    }

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

    public void InsertAtLast(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        } else {
            lastNode.next=n;
            lastNode=n;
        }

        size++;
    }

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

    public void printSize() {
        System.out.println("size = " + size);
    }

    public void insertAtPosition(Integer data, Integer p) {
        Node n= new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
        }else if(p<size){
            int inc=1;
            Node temp = header.next;
            Node prev=header;
            while (temp.next!=null && inc!=p){
                prev=temp;
                temp=temp.next;
                inc++;
            }
            prev.next=n;
            n.next=temp;
        }else{
            InsertAtLast(data);
        }

        size++;
    }
}
