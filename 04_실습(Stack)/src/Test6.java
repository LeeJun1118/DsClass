import java.util.Stack;

public class Test6 {
    public static void main(String[] args) {
        String s = "부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
        System.out.println(checkParen(s));
    }

    private static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '('|| c == '{' || c == '[') {
                stack.push(c);
            }
        }
        if (!stack.isEmpty()) {
            for (Character c : s.toCharArray()) {
                if (c == ')' || c == '}' || c == ']') {
                    stack.push(c);
                    if (!stack.isEmpty()) stack.pop();
                    else return false;
                    if (!stack.isEmpty()) stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
