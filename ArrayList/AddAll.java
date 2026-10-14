import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(10);
        l1.add(30);
        // [10, 10, 30]
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(50);
        l2.add(70);
        l2.add(90);
        l2.addAll(l1);
        // [50, 70, 90]
        // [50, 70, 90, 10, 10, 30]
        System.out.println(l1.add(90));
        System.out.println(l2);
    }
}
