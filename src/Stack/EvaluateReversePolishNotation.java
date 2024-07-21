//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
//
//Evaluate the expression. Return an integer that represents the value of the expression.
//
//Note that:
//
//The valid operators are '+', '-', '*', and '/'.
//Each operand may be an integer or another expression.
//The division between two integers always truncates toward zero.
//There will not be any division by zero.
//The input represents a valid arithmetic expression in a reverse polish notation.
//The answer and all the intermediate calculations can be represented in a 32-bit integer.
// 
//
//Example 1:
//
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
//Example 2:
//
//Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
//Example 3:
//
//Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//Output: 22
//Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//= ((10 * (6 / (12 * -11))) + 17) + 5
//= ((10 * (6 / -132)) + 17) + 5
//= ((10 * 0) + 17) + 5
//= (0 + 17) + 5
//= 17 + 5
//= 22

package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
    	Stack<String> stack = new Stack<>();
    	
    	for (String token : tokens) {
    		if (isNumeric(token)) {
    			stack.push(token);
    		}
    		else {
    			String str = calculation(stack, token);
    			stack.push(str);
    		}
    	}
        return Integer.parseInt(stack.peek());
    }
    
    private boolean isNumeric(String str) {
    	return str.matches("-?\\d+(\\.\\d+)?") || str.matches("\\+\\d+(\\.\\d+)?");
    }
    
    private String calculation(Stack<String> stack, String token) {
		int num2 = Integer.parseInt(stack.peek());
		stack.pop();
		int num1 = Integer.parseInt(stack.peek());
		stack.pop();
		int sum = 0;
		if (token.equals("+")) {
			sum = num1+num2;
			return String.valueOf(sum);
		}
		else if (token.equals("*")) {
			sum = num1*num2;
			return String.valueOf(sum);
		}
		else if (token.equals("/")) {
			sum = num1 / num2;
			return String.valueOf(sum);
		}
		else if (token.equals("-")) {
			sum = num1 - num2;
			return String.valueOf(sum);
		}
		return String.valueOf(sum);
    }
    
//    public int evalRPN(String[] tokens) {
//        final Map<String, BinaryOperator<Long>> op = Map.of(
//            "+", (a, b) -> a + b, "-", (a, b) -> a - b, "*", (a, b) -> a * b, "/", (a, b) -> a / b);
//        Deque<Long> stack = new ArrayDeque<>();
//
//        for (final String token : tokens)
//          if (op.containsKey(token)) {
//            final long b = stack.pop();
//            final long a = stack.pop();
//            stack.push(op.get(token).apply(a, b));
//          } else {
//            stack.push(Long.parseLong(token));
//          }
//
//        return stack.pop().intValue();
//      }
}
