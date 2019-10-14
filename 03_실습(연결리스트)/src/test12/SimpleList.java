package test12;

public class SimpleList {
    Node head;


    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int size() {
        int size = 0;
        for (Node p = head; p != null; p = p.next)
            size++;
        return size;
    }

    public String get(int i) {
        String v = "";
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        return v + p.data;
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