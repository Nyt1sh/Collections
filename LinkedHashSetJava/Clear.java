import java.util.LinkedHashSet;

public class Clear {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(54);
        set.add(87);
        set.add(30);
        set.add(6);
        set.add(6);
        System.out.println(set);
        System.out.println(set.isEmpty()); // --> False
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty()); // --> True

    }
}
