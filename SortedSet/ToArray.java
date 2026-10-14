import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        SortedSet<Integer> set = new TreeSet<>();
        set.add(56);
        set.add(97);
        set.add(54);
        set.add(6);
        set.add(96);
        set.add(30);
        set.addAll(arr);
        System.out.println(set);
        Object[] obj = set.toArray();
        for (Object n : obj) {
            System.out.println(n);
        }
    }
}
