import java.util.Scanner;

public class Main {
    public String solution(String sentence) {
        String result = "";
        int wordLen = 0;
        String[] strList = sentence.split(" ");

        for (String str : strList) {
            if (wordLen < str.length()) {
                wordLen = str.length();
                result = str;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Main main = new Main();
        System.out.println(main.solution(sentence));


    }
}
