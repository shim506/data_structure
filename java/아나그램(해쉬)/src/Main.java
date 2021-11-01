import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        boolean ans = true;

        if (str1.length() == str2.length()) {
            for (char ch : str1.toCharArray()) {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }
            for (char ch : str2.toCharArray()) {
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            for (char ch : map1.keySet()) {
                if (map1.get(ch) != map2.get(ch)) {
                    ans = false;
                    break;
                }
            }


        } else {
            ans = false;
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
