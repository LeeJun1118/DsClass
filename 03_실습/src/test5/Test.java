package test5;

public class Test {
    public static void main(String[] args) {
        Node head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printList(head);

        int searchValue = 3;

        Node newNode = new Node(7);
        Node p = head, prev = null;
        while (p != null && p.data != searchValue) {
            prev = p;
            p = p.next;
        }
        //연결리스트에 값이 하나도 없는거
        if (p == null)
            System.out.println(searchValue + "dese not exist");
        //값이 있다면
        else {
            //연결리스트가 비어 있지 않다면
            if (prev != null) prev.next = newNode;
            //연결리스트가 비어 있다면
            else head = newNode;
            newNode.next = p;
        }
        printList(head);

    }

    private static void printList(Node head) {
        for (Node p = head; p != null; p = p.next) System.out.print(p.data + "->");
        System.out.println();
    }
}
