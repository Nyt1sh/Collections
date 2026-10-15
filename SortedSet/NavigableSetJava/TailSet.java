import java.util.NavigableSet;
import java.util.TreeSet;

public class TailSet {
     public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(63);
        set.add(47);
        set.add(98);
        set.add(32);
        set.add(49);
        set.add(21);
        System.out.println(set);
        System.out.println(set.tailSet(49)); // by default true
        System.out.println(set.tailSet(49, false)); // boolean false makes the toElement exclusive
    }
}
