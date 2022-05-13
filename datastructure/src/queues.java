import java.util.PriorityQueue;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        //it follows the FiFo format
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
