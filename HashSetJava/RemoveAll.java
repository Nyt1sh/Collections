import java.util.HashSet;

public class RemoveAll {
    void main() {
         HashSet<Integer> hash1 = new HashSet<>();
        hash1.add(20);
        hash1.add(67);
        hash1.add(87);
        hash1.add(34);
        hash1.add(32);
        System.out.println(hash1);
        HashSet<Integer> hash2 = new HashSet<>();
        hash2.add(96);
        hash2.addAll(hash1);
        System.out.println(hash2);
        hash2.removeAll(hash1);
        System.out.println(hash2);

    }
}
