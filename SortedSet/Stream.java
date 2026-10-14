import java.util.SortedSet;
import java.util.TreeSet;

public class Stream {
    public static void main(String[] args) {
       
        SortedSet<Integer> set = new TreeSet<>();
        set.add(56);
        set.add(97);
        set.add(54);
        set.add(6);
        set.add(96);
        set.add(30);
        System.out.println(set);
        set.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
