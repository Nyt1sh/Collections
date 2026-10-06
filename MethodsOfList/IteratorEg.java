import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(70);
        list.add(79);
        list.add(63);
        list.add(51);
        list.add(73);
        list.add(52);
        list.add(48);
        list.add(98);
        // for(int i = 0; i<list.size(); i++)
        // {
        //     System.out.println(list.get(i));
        // }


        // for (Integer integer : list) {
        //     System.out.println(integer);
        // }

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            Integer number = itr.next();
            System.out.println(number);
        }
    }
}
