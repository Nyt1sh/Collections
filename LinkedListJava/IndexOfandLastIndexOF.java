
import java.util.LinkedList;

public class IndexOfandLastIndexOF {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(35);
        list.add(35);
        list.add(35);
        list.add(96);
        list.add(75);
        list.add(32);
        list.add(12);
        list.add(24);
        list.add(35);
        list.add(37);
        System.out.println(list);
        System.out.println(list.indexOf(35)); // 0
        System.out.println(list.lastIndexOf(35)); //8
        // System.out.println(list.size()); 
        // list.clear();
        // System.out.println(list);
        // System.out.println(list.isEmpty()); 
        

    }
}
