package theory3page;


public class thoery_3page {
    public static void main(String[] args) {
        Node head = null; //연결리스트가 하나도 안만들어진 상태
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        head = n1;
        n1.next = n2;
        n2.next = n3;

        //첫 위치 자료 삽입
        Node newNode = new Node(7);
        newNode.next = head;
        head = newNode;


        //끝 위치 자료 삽입
        Node lastNode = new Node(7);
        if (head != null)
        {
            Node p = head;
            while (p.next != null)
                p = p.next;
            p.next = lastNode;
        }
        else
            head = lastNode;


        //출력
        for (Node p = head; p != null; p = p.next){
            System.out.print(p.data + "=>");
        }

    }
}
