
import java.util.ArrayList;
import java.util.LinkedList;

public class Constructor2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(500);
        arr.add(600);
        LinkedList<Integer> list = new LinkedList<>(arr);
        list.add(35);
        list.add(58);
        list.add(96);
        list.add(75);
        list.add(32);
        list.add(12);
        list.add(24);
        list.add(37);
        System.out.println(list);
    }
}
