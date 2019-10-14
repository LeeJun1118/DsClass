package test13_1;

public class SimpleList {
    Node head;


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head !=null)
        {
            Node p = head;
            while (p.next != null) p = p.next;
            p.next = newNode;
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