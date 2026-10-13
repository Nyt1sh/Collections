import java.util.Vector;

public class Capacity {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>(5,2);
        list.add(85);
        list.add(56);
        list.add(43);
        list.add(98);
        list.add(98);
        list.add(98);
        System.out.println(list.capacity());
    }
}
