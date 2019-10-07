import java.util.LinkedList;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++){
            Random random = new Random();
            int v = random.nextInt(100);
            list.add(v);
        }
        System.out.println(list.get(999999));

    }
}
