
import java.util.LinkedHashSet;

public class Stream {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(54);
        set.add(87);
        set.add(30);
        set.add(6);
        set.add(9);
        System.out.println(set);
        set.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
