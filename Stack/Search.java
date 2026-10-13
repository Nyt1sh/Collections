import java.util.Stack;

public class Search {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(43);
        stack.push(67);
        stack.push(32);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        /*

           |            |
           |     32     |  --> peek
           |     67     |
           |     43     |
           |     30     |
           +============+
        
        
        */

           System.out.println(stack.search(30));
           System.out.println(stack.size());
    }
}
