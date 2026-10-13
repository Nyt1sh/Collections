
import java.util.Stack;

public class Peek {

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
        System.out.println(stack);
        System.out.println(stack.peek()); // --> ye top/peek element ko return karta hai 
        System.out.println(stack);
        
        System.out.println(stack.pop()); // -> Peek element ko pop(Remove) karta hai or return bhi karta hai
        System.out.println(stack);
    }
}
