
import java.util.NavigableSet;
import java.util.TreeSet;

public class Ceiling {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(63);
        set.add(47);
        set.add(98);
        set.add(32);
        set.add(49);
        set.add(21);
        System.out.println(set);
        System.out.println(set.ceiling(99)); // ye jo hai wo jo element aap argument mein pass kiye ho agar wo exist karta hai toh usi ko return kar dega warna usse ek bade element ko return karega, not exist ke case mein ye null return karega --> equality / greater ko return karega
    }
}
