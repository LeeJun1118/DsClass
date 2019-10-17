package test13_2;

public class SimpleList {
    Node head;
    Node tail;

    public void addLast(int data) {
        if (tail == null) head = tail = new Node(data);
        else {
            tail.next = new Node(data);
            tail = tail.next;
        }
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