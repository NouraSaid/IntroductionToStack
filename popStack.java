import java.util.Stack;

public class popStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
       
         
        System.out.println(stack.pop());

    }
