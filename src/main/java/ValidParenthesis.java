import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        //create a stack to keep track of characters

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{' ) {
                stack.pop();
            } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[' ){
                stack.pop();
            } else if( c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }

        }
        return stack.isEmpty();

    }
//    public boolean isValid(String s) {
//        if (s.length() % 2 != 0) return false;
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (
//                    stack.isEmpty() &&
//                            (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
//            ) return false; else {
//                if (!stack.isEmpty()) {
//                    if (
//                            stack.peek() == '(' && s.charAt(i) == ')'
//                    ) stack.pop();
//                    else if (
//                            stack.peek() == '{' && s.charAt(i) == '}'
//                    ) stack.pop();
//                    else if (
//                            stack.peek() == '[' && s.charAt(i) == ']'
//                    ) stack.pop();
//                    else stack.add(s.charAt(i));
//                } else stack.add(s.charAt(i));
//            }
//        }
//        return stack.isEmpty();
//    }
    public static void main(String[] args){
       System.out.println(isValid("([}}])"));

    }
}
//if i is (, { or [ add it to a hashmap with its frequency
//if i is ), }, or ] check to see if its corresponding bracket exists, if it does, remove it from the map