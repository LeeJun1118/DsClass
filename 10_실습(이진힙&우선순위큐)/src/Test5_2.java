import java.util.Arrays;

public class Test5_2 {
    public static void main(String[] args) {
        int heap[]= {3,1,2,8,7,9,4,6,5,4};
        int last=heap.length-1;
        for (int i = heap.length/2; i >=0; i--) heapifyDown(heap, last, i); // max-heap 빌드 O(n)
        System.out.println(Arrays.toString(heap));
        System.out.println("최대값="+peek(heap)); // 최대값 출력
        for (int i = 0; i < 5; i++) { // 상위 5개 자료 추출
            System.out.print(remove(heap, last--)+" "); // 각 추출 후 힙 크기 1 감소
        }
        System.out.println();
        System.out.println(Arrays.toString(heap));

    }

    private static int remove(int[] heap, int last) {
        //앞 쪽에 simpleHeap에 구현해 놓은 거랑 거의 비슷하게 구현하면된다.
        if(last<0) throw new RuntimeException("heap empty");
        int data=heap[0]; // root 노드 자료 추출
        heap[0]=heap[last--]; // 마지막 노드 root로 이동 & 크기 1 감소
        heapifyDown(heap,last,0);
        return data;
    }

    private static int peek(int[] heap) {
        //힙의 0번쨰 값을 return 하면 된다.
        return heap[0];
    }

    private static void heapifyDown(int[] heap, int last, int p) {
        //부등호만 바꾸면 최소 최대가 바뀐다.
        for (int c = 2*p+1; c<=last; p=c, c=2*p+1) {
            if(c<last && heap[c]<heap[c+1]) c++; // 두 child 중 큰 값을 갖는 child 선택
            if(heap[p]>=heap[c]) break; // 이미 heap 조건 만족 시 반복 종료
            int temp=heap[c]; heap[c]=heap[p]; heap[p]=temp; // 힙 조건 위배 시 swap
        }
    }
}
