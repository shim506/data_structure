import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String ans = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                ans += str.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder(ans);
        String revAns = sb.reverse().toString();


        if (revAns.equals(ans)) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(main.solution(str));
    }
}
