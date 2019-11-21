import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //N개의 숫자를 받아서 제일 작은 크기를 갖는 10개의 정수를 찾는다. 정렬해서 밑에 있는 10개 뽑아내도 되고
        //균형 이진트리, 이진힙을 써도 된다.
        //그 중에 뭐가 빠른지 시간을 측정해본 것이다.
        Random random=new Random();
        int N=1000000;
        ArrayList<Integer> list=new ArrayList<>();
        int v[]=new int[N];
        for (int i = 0; i < N; i++) {
            int value=random.nextInt(N);
            list.add(value);
            v[i]=value;
        }
        long start;
        // PriorityQueue add
        start=System.currentTimeMillis();
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for (int i = 0; i < v.length; i++) pq1.add(v[i]);
        for (int i = 0; i < 10; i++) System.out.print(pq1.remove()+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (PriorityQueue-add)");
        // PriorityQueue build
        start=System.currentTimeMillis();
        PriorityQueue<Integer> pq2=new PriorityQueue<>(list);
        for (int i = 0; i < 10; i++) System.out.print(pq2.remove()+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (PriorityQueue-build)");
        // TreeSet add
        start=System.currentTimeMillis();
        TreeSet<Integer> bst=new TreeSet<>();
        for (int i = 0; i < v.length; i++) bst.add(v[i]);
        for (int i = 0; i < 10; i++){
            Integer n=bst.first();
            System.out.print(n+" ");
            bst.remove(n);
        }
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (TreeMap)");
        // Sort
        start=System.currentTimeMillis();
        Arrays.sort(v);
        for (int i = 0; i < 10; i++) System.out.print(v[i]+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (Arrays.sort())");
    }
}
