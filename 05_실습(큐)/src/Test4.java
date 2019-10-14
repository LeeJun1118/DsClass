import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        //이론 자료 6page 참고
        LinkedList<Integer> queue = new LinkedList<>();
        int n = 7, k = 3;
        int front;
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        for (int i = 0; i < k-1; i++) {
            front = queue.removeFirst();
            queue.add(front);
        }
    }
}
