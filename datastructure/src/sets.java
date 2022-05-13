import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        //sets do not allow duplicate values in their contest
        Set<Integer> now = new HashSet<>();
        now.add(1);
        now.add(3);
        now.add(1);
        now.add(5);
        now.add(6);
        now.add(4);
        System.out.println(now);
        Set<Integer> now1 = new TreeSet<>();
        now1.add(1);
        now1.add(3);
        now1.add(1);
        now1.add(5);
        now1.add(6);
        now1.add(4);
        System.out.println(now1);
    }
}
