import java.util.HashSet;

public class IsEmpty {
    void main() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(20);
        hash.add(67);
        hash.add(87);
        hash.add(34);
        hash.add(32);
        hash.clear(); // --> this is use to clear the elements of hashset
        System.out.println(hash.isEmpty());
    }
}
