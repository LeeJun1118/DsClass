package test11;

public class SimpleList {
    Node head;
    public void addFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void removeFirst() {
        if (head != null){
            Node p = head;
            head = head.next;
            p.next = null;
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
