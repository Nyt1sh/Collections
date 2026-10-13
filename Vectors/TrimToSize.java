import java.util.Vector;

public class TrimToSize {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(85);
        list.add(56);
        list.add(43);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.trimToSize();
        System.out.println(list.capacity());
        System.out.println(list);
    }    
}
