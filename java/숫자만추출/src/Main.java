import java.util.Scanner;

public class Main {
    public int solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                result += str.charAt(i);
            }
        }
        return Integer.parseInt(result);

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
