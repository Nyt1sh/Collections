import java.util.ArrayList;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Guava");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        Object[] str = list.toArray();
        System.out.println(str[0]);
    }
}
