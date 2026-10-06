
import java.util.ArrayList;

public class Get {
     public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Guava");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Cherry");
        

        System.out.println(list);
        System.out.println(list.get(3));
    }
}
