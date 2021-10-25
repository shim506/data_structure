import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                ch = (char) (ch + 32);
            } else {
                ch = (char) (ch - 32);
            }
            answer += ch;
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println(main.solution(scanner.next()));



    }
}
