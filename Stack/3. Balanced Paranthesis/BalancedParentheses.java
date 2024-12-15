import java.util.Stack;

public class BalancedParentheses {
    // Function to check if the parentheses are balanced
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse the given expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is an opening parenthesis, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If the character is a closing parenthesis, check for balance
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty, return false
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if the popped element matches the closing parenthesis
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all parentheses were balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "([{}])";
        String expression2 = "([{}]";

        System.out.println("Expression: " + expression1 + " is balanced: " + areParenthesesBalanced(expression1));
        System.out.println("Expression: " + expression2 + " is balanced: " + areParenthesesBalanced(expression2));
    }
}
