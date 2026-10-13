import java.util.Stack;

public class example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(43);
        stack.push(67);
        stack.push(32);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.clear();
        System.out.println(stack.isEmpty());
        

    }
}
