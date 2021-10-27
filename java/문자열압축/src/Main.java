import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "";
        char nowChar = str.charAt(0);
        int cnt = 1;

        for (int i = 1; i < str.length(); i++) {
            if (nowChar == str.charAt(i)) {
                cnt++;
            } else {
                result += nowChar;
                if (cnt > 1) {
                    result += Integer.toString(cnt);
                }
                nowChar = str.charAt(i);
                cnt = 1;
            }


        }
        result += nowChar;
        if (cnt > 1) {
            result += Integer.toString(cnt);
        }
        return result;

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));

    }
}
