import java.util.NavigableSet;
import java.util.TreeSet;

public class Subset {
     public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(63);
        set.add(47);
        set.add(98);
        set.add(32);
        set.add(49);
        set.add(21);
        System.out.println(set);
        System.out.println(set.subSet(32, 63)); // first argument by default inclusive hoga or second element exclusive hoga
        System.out.println(set.subSet(32, true, 63, true)); // boolean true and true here are representing inclusive or exclusiveness of fromElement and toElement
        System.out.println(set.subSet(32, false, 63, true)); 
        
    }
}
