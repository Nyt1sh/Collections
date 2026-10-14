
import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        ArrayList<String> search = new ArrayList<String>();
        String str;
        Scanner sc = new Scanner(System.in);
        boolean searchMore = true;
        while (searchMore) {
            System.out.println("Search : ");
            str = sc.nextLine();
            search.add(str);

            // [1, 5, 23, 63, 52, 54, 15, 96, 87, 85]
            //[23, 63, 52, 54, 15]
            if(search.size() > 5)
            {
                search.remove(0);
            }

            System.out.println("Would you like to search more : Y/N");
            char choice;
            choice = sc.next().charAt(0);
            sc.nextLine();
            searchMore = (choice == 'y' || choice == 'Y') ? true  : false;
        }
        System.out.println(search);
        
    }
}
