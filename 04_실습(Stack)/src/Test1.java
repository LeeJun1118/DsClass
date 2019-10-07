import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택 전체 크기 = " + stack.size());
        System.out.println("스택이 비어 있는가 ? " + stack.isEmpty());

        int v;
        v = stack.getFirst();
        System.out.println("스택 top 위치 자료 확인 : " + v);
        v = stack.removeFirst();
        System.out.println("스택 top 위치 자료 삭제 = " + v);
        System.out.println("스택 전체 내용: " + stack);
        System.out.println("스택 top 위치 자료 제거 = " + stack.pop());
        System.out.println("스택 전체 내용: " + stack);
        System.out.println("스택 top 위치 자료 삭제 = " + stack.pop());
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택이 비어 있는가?" + stack.isEmpty());
        //---------------------------------------------------------------//
        System.out.println();
        System.out.println();
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택 전체 크기 = " + stack.size());
        System.out.println("스택이 비어 있는가 ? " + stack.isEmpty());

        v = stack.getLast();
        System.out.println("스택 top 위치 자료 확인 : " + v);
        v = stack.removeLast();
        System.out.println("스택 top 위치 자료 삭제 = " + v);
        System.out.println("스택 전체 내용: " + stack);
        System.out.println("스택 top 위치 자료 제거 = " + stack.pop());
        System.out.println("스택 전체 내용: " + stack);
        System.out.println("스택 top 위치 자료 삭제 = " + stack.pop());
        System.out.println("스택 전체 내용 : " + stack);
        System.out.println("스택이 비어 있는가?" + stack.isEmpty());

    }
}
