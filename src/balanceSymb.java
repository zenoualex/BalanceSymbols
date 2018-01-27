import java.util.Stack;
import java.util.Scanner; 

public class balanceSymb {
	private static Scanner reader;

	public static String balancer(String s) {
		boolean Matches = true;
		//checks if input is empty
		if (s.isEmpty() == true) {
			System.out.println("String Is Empty please type some symbols.");
			return "Input is empty";
		}
		//Checks that only symbols are allowed and not anything else
		for (int counter = 0; counter < s.length() && Matches; counter++) {
			char letter = s.charAt(counter);
			if (letter != '(' && letter != ')' && letter != '{' && letter != '}' && letter != '[' && letter != ']') {
				System.out.println("You can only type symbols like (, {, [");
				Matches = false;
				return "Only Symbols are allowed";
			}
		}
		//if all input is valid continue
		if (Matches) {
			// import class stack
			Stack<Character> stack = new Stack<Character>();
			// create loop for reading every char on string (s)
			for (int i = 0; i < s.length(); i++) {
				char firstcheck = s.charAt(i);
				// Checks if Symbol matches with string
				if (firstcheck == '(' || firstcheck == '[' || firstcheck == '{') {
					// if yes register key to stack library
					stack.push(firstcheck);
				}
				// Check if symbol closes in the string we gave
				if (firstcheck == ')' || firstcheck == ']' || firstcheck == '}') {
					char lastcheck = stack.peek();
					// Checks if symbol also close
					if (firstcheck == ')' && lastcheck == '(' || firstcheck == ']' && lastcheck == '['
							|| firstcheck == '}' && lastcheck == '{') {
						// if yes it removes from the list
						stack.pop();
					} else {
						// If there are still symbols on stack library means that "Symbols are not
						// balanced"
						System.out.println("Symbols are not balanced");
						return "Symbols are not Balanced";
					}
				}
			}
			// Then if Stack library is empty all symbols are matches
			if (stack.isEmpty() == true && s.isEmpty() == false) {
				System.out.println("Symbols Are Balanced");
				return "Symbols Are Balanced";
			}

		}
		return "";
	}

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		// calling the class balancer
		System.out.println("Enter Some Symbols:");
		String s = reader.next();
		System.out.println("Input: "+s);
		balancer(s);
	}
}