import java.util.Stack;

public class balanceSymb {
	public static char balancer(String s) {
		//import class stack
		Stack<Character> stack = new Stack<Character>();
		//create loop for reading every char on string (s)
		for (int i = 0; i < s.length(); i++) {
			char firstcheck = s.charAt(i);
			//Checks if Symbol matches with string
			if (firstcheck == '(' || firstcheck == '[' || firstcheck == '{') {
				//if yes register key to stack library
				stack.push(firstcheck);
			}
			//Check if symbol closes in the string we gave
			if (firstcheck == ')' || firstcheck == ']' || firstcheck == '}') {
				char lastcheck = stack.peek();
				//Checks if symbol also close
				if (firstcheck == ')' && lastcheck == '(' || firstcheck == ']' && lastcheck == '['
						|| firstcheck == '}' && lastcheck == '{') {
					//if yes it removes from the list
					stack.pop();
				}else {
					//If symbol doesnt close "Symbols are not balanced"
					System.out.println("Is Not Balanced");
					return 0;
				}
			}
		}
		//Then if Stack library is empty all symbols are matches
		System.out.println("Symbols Are Balanced");
		return 0;
	}

	public static void main(String[] args) {
		//We import the string for the program to execute
		String s = "[()()()()()()()()()()()()()()()()()()(){}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{{{}}}{}{}{}{}{}{}{}{}{}{}]";
		//calling the class balancer
		balancer(s);
	}
}