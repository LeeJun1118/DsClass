import java.util.LinkedList;

public class Theory_6page {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5); // addLast가 동작 하는 것.
        list.add(8);
        list.add(4);
        System.out.println(list);

        int v = list.get(2);
        System.out.println(v);

    }
}
