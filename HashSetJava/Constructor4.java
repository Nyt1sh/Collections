
import java.util.ArrayList;
import java.util.HashSet;

public class Constructor4 {

    void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(98);
        arr.add(46);
        arr.add(79);
        arr.add(54);
        HashSet<Integer> hash1 = new HashSet<>(arr);
        hash1.add(20);
        hash1.add(67);
        hash1.add(87);
        hash1.add(34);
        hash1.add(32);
        System.out.println(hash1);

    }
}
