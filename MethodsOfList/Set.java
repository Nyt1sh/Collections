import java.util.ArrayList;

public class Set {
     public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Guava");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Cherry");

        System.out.println(list);
        
        list.set(2, "Litchi");

        System.out.println(list);
    }
}
