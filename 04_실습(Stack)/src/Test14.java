import java.util.Arrays;

public class Test14 {
    static class SimpleStack {
        int stack[];
        int top=-1;
        public SimpleStack(int size) {
            stack=new int[size];
        }
        public void push(int data) {
            stack[++top]=data;
        }
        public int pop() {
            return stack[top--];
        }
        @Override
        public String toString() {
            return "top="+top+", stack="+ Arrays.toString(stack);
        }

        public boolean isEmpty(){
            if (top != -1) return false;
            else return true;
        }

        public boolean isFull(){
            if (top == stack.length-1) return true;
            else return false;
        }
        public int peek(){ return stack[top];}


    }
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(10); // 크기 10의 Stack 생성

        // 스택에 5 9 1 순차 삽입
        stack.push(5);
        stack.push(9);
        stack.push(1);

        System.out.println(stack); // 스택 출력

        int data=stack.pop(); // 스택에서 자료 추출
        System.out.println("Data deleted from stack:"+data);

        System.out.println(stack); // 스택 출력

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        stack.push(3);
        System.out.println(stack.peek());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        System.out.println(stack);
        System.out.println(stack.isFull());
    }
}
