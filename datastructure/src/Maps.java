import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps extends list_in_Java {
    public static void main(String[] args) {
        person person = new person("rose", 20, 5.2);
        person person1 = new person("charles", 21, 4.9);
        Map<Integer,person> map = new HashMap<>();
        map.put(1,person);
        map.put(2,person1);

    }
}
