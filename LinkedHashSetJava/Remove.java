
import java.util.LinkedHashSet;

public class Remove {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(54);
        set.add(87);
        set.add(30);
        set.add(6);
        System.out.println(set);
        set.remove(87);
        System.out.println(set);
    }
}
