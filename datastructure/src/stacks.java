import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        //this follows the LiFo format
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}
