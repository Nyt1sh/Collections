
import java.util.ArrayList;

public class LastIndexOf {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Guava");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Cherry");
        list.add("Apple");
        list.add("Cherry");
        list.add("Apple");
        

        System.out.println(list.lastIndexOf("Apple"));
    }
}
