
import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Guava");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Cherry");
        list.add(2, "Banana");

        System.out.println(list);
    }
}
