import java.util.Stack;

public class Test5 {
    public static void main(String[] args) {
        //
        String s = "(1+3*(4+5))/(6*(7+8))";
        System.out.println(checkParen(s));
    }

    private static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<>();
        boolean tf = true;
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                System.out.println(stack.push(c));
            }
        }

        while (!stack.isEmpty())
        {
            for (Character c : s.toCharArray()) {
                if (c == ')')
                {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty())
            return false;

        return stack.isEmpty();
    }


}
