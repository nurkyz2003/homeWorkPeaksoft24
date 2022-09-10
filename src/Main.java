import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer>set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(symmetricDifference(set1,set2));
    }
    public static <Integer> Set<Integer> symmetricDifference(Set< ? extends Integer > set1, Set< ? extends Integer > set2) {
        Set <Integer> result = new HashSet<>();
        for(Integer i : set1) {
            if (!set2.contains(i)){
                result.add(i);
            }
        }
        for(Integer j : set2) {
            if (!set1.contains(j)){
                result.add(j);
            }
        }
        return result;
    }
}