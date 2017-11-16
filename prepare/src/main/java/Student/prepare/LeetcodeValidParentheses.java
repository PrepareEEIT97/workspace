package Student.prepare;

import java.util.Stack;

public class LeetcodeValidParentheses {

	public static void main(String[] args) {
		// 網路解答
		
//		Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//		The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
		
		String test="()";
		Stack<Character> stack = new Stack<Character>();
		char value[]=test.toCharArray();
		boolean a;
		for(int x=0;x<=test.length()-1;x++){
//			System.out.println(value[x]);
			if(value[x]=='('){
				stack.push(')');
			}else if(value[x]=='['){
				stack.push(']');
			}else if(value[x]=='{'){
				stack.push('}');
			}else if (stack.isEmpty() || stack.pop() != value[x])
				a= false;
			}
//			System.out.println(stack);
			a=stack.isEmpty();
			
			System.out.println(a);
			
		}
}
