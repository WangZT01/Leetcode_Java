package Top100F;
import java.util.*;
public class Valid_Parentheses_20 {
	
	public static boolean isValid(String s) {
        boolean result = false;
        
        char[] a = s.toCharArray();
        
        Stack<Character> stack = new  Stack<Character>();
        for(int i = 0; i < a.length ; i++) {
        	
        	if(a[i] == '(' || a[i] == '[' || a[i] == '{' ) {
        		stack.push(a[i]);
        	}
        	else if(a[i] == ')') {
        		
        		if(stack.isEmpty()) {// empty judgment can be put in front.
        			return false;
        		}
        		if(stack.peek() == '(') {
        			stack.pop();
        		}
        		else {
        			return false;
        		}
        	}
        	else if(a[i] == ']') {
        		
        		if(stack.isEmpty()) {
        			return false;
        		}
        		if(stack.peek() == '[') {
        			stack.pop();
        		}
        		else {
        			return false;
        		}
        	}        	
        	else if(a[i] == '}') {
        		if(stack.isEmpty()) {
        			return false;
        		}
        		if(stack.peek() == '{') {
        			stack.pop();
        		}
        		else {
        			return false;
        		}
        	}
        }
        if(stack.isEmpty()){
        	return true;
        }
        return result;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println( isValid(s) );
	}
	
	
}
