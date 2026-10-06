import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        //  ArrayList<String> list = new ArrayList<String>();

        // list.add("Guava");
        // list.add("Banana");
        // list.add("Mango");
        // list.add("Apple");
        // list.add("Cherry");
        // list.add("Apple");
        // list.add("Cherry");
        // list.add("Apple");
        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(7);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println(list);
        list.remove(Integer.valueOf("1"));
        System.out.println(list);
    }
}
