package test13_2;

public class SimpleList {
    Node head;
    Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        tail = head;
        if (head != null){
            while (tail.next != null) tail = tail.next;
            tail.next = newNode;
        }
        else head = newNode;
    }

    @Override
    public String toString() {
        String v = "";
        for (Node p = head; p != null; p = p.next) {
            v = v + p.data + "=>";
            //v += p.data + "=>";
        }
        return v;
    }
}