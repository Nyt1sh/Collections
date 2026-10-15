import java.util.NavigableSet;
import java.util.TreeSet;

public class Higher {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(63);
        set.add(47);
        set.add(98);
        set.add(32);
        set.add(49);
        set.add(21);
        System.out.println(set);
        System.out.println(set.higher(49)); // ye argument mein pass kiye gaye elements se greater element ko return karta hai, ya nahi milne pe null return karega
    }
}
