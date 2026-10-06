import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(70);
        list.add(79);
        list.add(63);
        list.add(51);
        list.add(73);
        list.add(52);
        list.add(48);
        list.add(98);
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
