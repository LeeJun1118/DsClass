package test16;

public class SimpleList {
    Node head;
    Node tail;


    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
       if (tail == null)
       {
           head = newNode;
           tail = newNode;
       }
       else{
           Node p = head;
           while (p.next != null) p = p.next;
           p.next = newNode;
           newNode.prev = p;
           tail = newNode;
       }
    }

    public void removeFirst() {
        Node p = head;
        head = p.next;
        p.next.prev = null;
    }

    public void removeLast() {
        Node p = tail;
        Node q = p.prev;

        tail = q;
        q.next = null;
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