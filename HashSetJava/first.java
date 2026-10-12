
import java.util.HashSet;

public class first {
    void main() {
        HashSet hash = new HashSet();
        hash.add(32);
        hash.add(2);
        hash.add(3);
        hash.add(31);
        boolean inserted = hash.add(34);
         hash.add(34);

        System.out.println(inserted);
        System.out.println(hash);

    }
}