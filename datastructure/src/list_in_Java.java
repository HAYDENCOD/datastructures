import java.util.*;

/*
this show different ways through which a list can be used;
 */
public class list_in_Java {
    static class person{
        String name;
        int age;
        double height;

        public person(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<String> list1 = new ArrayList<>();
        list1.add("paul");
        list1.add("webo");
        list1.add("java");
        list1.add("sofware");


        person person = new person("paul", 19, 5.1);
        List<person> list2 = new ArrayList<>();
        list2.add(person);

        //others
        List<Object> now = new LinkedList<>();
        List<Object> now1 = new ArrayList<>();
        List<Object> now2 = new Stack<>();
        List<Object> now3 = new Vector<>();
    }
}
