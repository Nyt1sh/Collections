import java.util.HashSet;

public class ToArray {
    void main() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(20);
        hash.add(67);
        hash.add(87);
        hash.add(34);
        hash.add(32);
        System.out.println(hash);
        Object[] arr = hash.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
