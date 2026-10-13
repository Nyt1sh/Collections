import java.util.LinkedHashSet;

public class ToArray {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(54);
        set.add(87);
        set.add(30);
        set.add(6);
        set.add(6);
        System.out.println(set);
        Object[] arr = set.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
