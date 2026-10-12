import java.util.HashSet;

public class ForEach {
    void main() {
         HashSet<Integer> hash = new HashSet<>();
        hash.add(20);
        hash.add(67);
        hash.add(87);
        hash.add(34);
        hash.add(32);
        for (int n : hash) {
            System.out.println(n);
        }
    }
}
