import java.util.NavigableSet;
import java.util.TreeSet;

public class Floor {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(63);
        set.add(47);
        set.add(98);
        set.add(32);
        set.add(49);
        set.add(21);
        System.out.println(set);
        System.out.println(set.floor(31)); // ye jo hai wo jo element aap argument mein pass kiye ho agar wo exist karta hai toh usi ko return kar dega warna usse ek chhote element ko return karega, not exist ke case mein ye null return karega --> equality / lesser ko return karega
    }
}
