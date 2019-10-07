import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(77);
        list.add(99);
        list.add(88);

        int v1 = list.get(0);
        int v2 = list.get(1);
        int v3 = list.get(2);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
