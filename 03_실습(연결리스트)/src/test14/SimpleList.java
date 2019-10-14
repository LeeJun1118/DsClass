package test14;

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

    public void removeLast() {
        if (head != null){
            Node p = head, prev = null;
            while (p.next != null){
                prev = p;
                p = p.next;
            }
            if (prev != null) prev.next = null;
            else head = null;
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