import java.util.ArrayList;

public class Clear {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sohan");
        list.add("Mohan");
        list.add("Rohan");
        list.add("Sonu");
        list.add("Monu");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
