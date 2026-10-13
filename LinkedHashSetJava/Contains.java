import java.util.LinkedHashSet;

public class Contains {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(54);
        set.add(87);
        set.add(30);
        set.add(6);
        set.add(6);
        System.out.println(set);
        System.out.println(set.contains(30));
        System.out.println(set.contains(96));
        set.addFirst(103);
        set.addLast(107);
        System.out.println(set);
    }
}
