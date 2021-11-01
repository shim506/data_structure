import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char answer;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String voteString = scanner.next();


        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : voteString.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxNum = Integer.MIN_VALUE;
        char result = ' ';
        for (char x : map.keySet()) {
            if (map.get(x) > maxNum) {
                maxNum = map.get(x);
                result = x;
            }
        }
        System.out.println(result);

    }
}
