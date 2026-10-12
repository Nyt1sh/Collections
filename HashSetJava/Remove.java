import java.util.HashSet;

public class Remove {
    void main() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(20);
        hash.add(67);
        hash.add(87);
        hash.add(34);
        hash.add(32);
        System.out.println(hash);
        hash.remove(20); // --> true if element is removed
        hash.remove(50); // boolean false --> if no element is removed
        System.out.println(hash);
    }
}
