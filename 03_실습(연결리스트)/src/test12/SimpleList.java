package test12;

public class SimpleList {
    Node head;
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public int get(int i) {
        Node p = head;
        while (i-- > 0) p = p.next;
        return p.data;
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