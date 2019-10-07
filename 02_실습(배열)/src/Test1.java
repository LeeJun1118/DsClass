import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(77);
        list.add(88);
        list.add(99);
        System.out.println(list);

        int v = list.get(0);
        System.out.println(v);
    }
}
