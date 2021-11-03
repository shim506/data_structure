import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int k = scanner.nextInt();


        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            queue.offer(i+1);
        }
        int ans = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                int x = queue.poll();
                queue.offer(x);
                //
            }
            ans = queue.poll();
            //System.out.println(ans);
        }
        System.out.println(ans);


    }
}
