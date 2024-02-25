import java.util.Stack;

public class StackInitialization {
    public static void main(String[] args) { 
        
        
        Stack<Integer> stack = new Stack<>(); 
        
        for(int i=0; i<10; i++) {
        stack.push(i);  } // push only 10 element in the stack
        
        System.out.println(stack); //print the stack

        }
    }
