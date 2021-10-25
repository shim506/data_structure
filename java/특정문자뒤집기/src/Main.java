import java.util.Scanner;

public class Main {
    public String solution(String word) {

        char[] ch = word.toCharArray();
        int front = 0, back = word.length() - 1;

        while (front < back) {
            if (!Character.isAlphabetic(ch[front])) {
                front++;
            } else if (!Character.isAlphabetic(ch[back])) {
                back--;

            } else {
                char fChar = ch[front];
                char bChar = ch[back];

                ch[front] = bChar;
                ch[back] = fChar;
                front++;
                back--;
            }

        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Main main = new Main();
        System.out.println(main.solution(str));

    }
}
