
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(64);
        list.add(94);
        list.add(56);
        list.add(65);
        list.add(3, 74);
        list.addFirst(56);
        System.out.println(list);
    }
}
