import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String mustSubj = scanner.nextLine();
        String allSubj = scanner.nextLine();

        Queue<Character> queue = new LinkedList();

        for (char ch : mustSubj.toCharArray()) {
            queue.offer(ch);
        }

        for (char ch : allSubj.toCharArray()) {
            if (queue.peek() == ch) {
                queue.poll();
                if (queue.isEmpty()) {
                    System.out.println("YES");

                    System.exit(0);
}

            } else {
                if (queue.contains(ch)) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");

    }
}
