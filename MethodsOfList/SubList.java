
import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        // list1 = [10, 12, 13, 15, 14, 18, 19, 63, 17, 15, 12, 13, 16, 17, 20];
        // list2 = [19, 63, 17, 15, 12]
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(14);
        list.add(18);
        list.add(19);
        list.add(63);
        list.add(17);
        System.out.println("list 1 = " + list);
        List<Integer> list2 = new ArrayList<Integer>();
        list2 = list.subList(1, 5);
        System.out.println("list 2 = " + list2);
    }
}


// String str = Hello
// vbu result
// drishyam 3
// drishyam 3
// drishyam 3
// drishyam 3
// drishyam 3
// drishyam 3
// drishyam 3
// drishyam 3
