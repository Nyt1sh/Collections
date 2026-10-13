
import java.util.Stack;

public class Empty {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(43);
        stack.push(67);
        stack.push(32);
        /*

           |            |
           |     32     |  --> peek
           |     43     |
           |     67     |
           |     30     |
           +============+
        
        
        */
    //    stack.clear();
       System.out.println(stack.empty());
       System.out.println(stack.isEmpty());
    }
}
