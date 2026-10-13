import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RetainAll {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(97);
        arr.add(100);
        arr.add(10);
        arr.add(1);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(54);
        set.add(87);
        set.add(30);
        set.add(6);
        set.add(6); // will return false
        set.addAll(arr);
        System.out.println(set);
        set.retainAll(arr);
        System.out.println(set);
    }
}
