import java.util.HashSet;

public class Clone {
    void main(String[] args) {
         HashSet<Integer> hash1 = new HashSet<>();
        hash1.add(20);
        hash1.add(67);
        hash1.add(87);
        hash1.add(34);
        hash1.add(32);
        HashSet<Integer> hash2 = (HashSet<Integer>)hash1.clone();
        // Used for cloning the set
        hash2.add(90);
        System.out.println(hash1);
        System.out.println(hash2);
        //Shallow Copy
        // HashSet<HashSet<Integer>> has3 = new HashSet<>();
    }
}
