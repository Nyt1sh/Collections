
import java.util.ArrayList;
import java.util.LinkedList;

public class Add {
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
    list.add(0,24);
    list.addFirst(26);
    list.addLast(600);
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(25);
    arr.add(100);
    list.addAll(arr);
    System.out.println(list);
   } 
}
