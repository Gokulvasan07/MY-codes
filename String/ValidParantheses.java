import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            if (vParantheses(str))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static boolean vParantheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!match(top, c)) return false;
            }
        }

        return stack.isEmpty();
    }

    static boolean match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
