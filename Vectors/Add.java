
import java.util.Vector;

public class Add {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(85);
        list.add(56);
        list.add(43);
        list.add(0, 98);
        list.remove(2);
        System.out.println(list);

    }
}
