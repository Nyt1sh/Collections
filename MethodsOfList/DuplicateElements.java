
import java.util.ArrayList;

// Question: Remove duplicate elements from given list
// list = [45, 12, 36, 45, 85, 96, 34, 75, 89, 63, 12, 12, 25, 36, 47, 36, 12, 15, 85];
public class DuplicateElements{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(36);
        list.add(45);
        list.add(85);
        list.add(96);
        list.add(34);
        list.add(75);
        list.add(89);
        list.add(63);
        list.add(12);
        list.add(25);
        list.add(36);
        list.add(47);
        list.add(36);
        list.add(12);
        list.add(15);
        list.add(85);
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            if(!list2.contains(list.get(i)))
            {
                list2.add(list.get(i));
            }
        }
        System.out.println(list);
        System.out.println(list2);
    }
}