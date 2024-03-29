import java.util.Stack;

public class Test5 {
    public static void main(String[] args) {
        //
        String s = "(1+3*(4+5))/(6*(7+8))";
        System.out.println(checkParen(s));
    }

    private static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else if(c == ')')
            {
                if (stack.isEmpty()) return false;
                else {
                    if (stack.peek() == '(') stack.pop();
                    else return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
