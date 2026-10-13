
import java.util.Vector;

public class EnsureCapacity {

    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.ensureCapacity(21);
        list.add(85);
        list.add(56);
        list.add(43);
        list.add(98);
        
        System.out.println(list.capacity());
        System.out.println(list);
    }
}
