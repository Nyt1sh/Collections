import java.util.ArrayList;
import java.util.LinkedList;

public class Remove {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(35);
    list.add(58);
    list.add(96);
    list.add(75);
    list.add(32);
    list.add(12);
    list.add(24);
    list.add(37);
    System.out.println(list);
    list.remove(3); //Index basis pe remove karta hai
    list.remove(Integer.valueOf(32));

    list.removeFirst();
    list.removeLast();
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(25);
    arr.add(100);
    list.addAll(arr);
    System.out.println(list);
    
    // list.removeAll(arr);
    list.retainAll(arr);
    System.out.println(list);
    }
}
