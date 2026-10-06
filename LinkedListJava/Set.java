
import java.util.LinkedList;

public class Set {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(35);
        list.add(58);
        list.add(96);
        list.add(75);
        list.add(32);
        list.add(12);
        list.add(24);
        list.add(37);
        list.add(1, 100);
        System.out.println(list);
        list.set(2, 36);
        System.out.println(list);
    }
}
