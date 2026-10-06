import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Sohan");
        list1.add("Mohan");
        list1.add("Rohan");
        list1.add("Sonu");
        list1.add("Monu");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Manisha");
        list2.add("Aarti");
        list2.add("Sapna");
        list2.addAll(list1);
        System.out.println(list2);
        list2.removeAll(list1);
        System.out.println(list2);
    }
}
