import java.util.Collections;
import java.util.PriorityQueue;

public class Test3 {
    public static void main(String[] args) {
        int v[]={4, 2, 9, 5, 7, 5, 8, 10, 15};
        // PriorityQueue<Integer> pq=new PriorityQueue<>(); // min-heap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        for (int i = 0; i < v.length; i++) {
            pq.add(v[i]);
            System.out.println(pq);
        }
        for (int i = 0; i<v.length; i++) {
            System.out.println(pq.remove()+"=>"+pq);
        }
    }
}
