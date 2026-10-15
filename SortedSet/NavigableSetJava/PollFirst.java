import java.util.NavigableSet;
import java.util.TreeSet;

public class PollFirst {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(63);
        set.add(47);
        set.add(98);
        set.add(32);
        set.add(49);
        set.add(21);
        System.out.println(set);
        System.out.println(set.pollFirst()); // ye first element ko retreive kar ke return karta hai or usko remove bhi kar deta hai
        System.out.println(set);
    }
}
