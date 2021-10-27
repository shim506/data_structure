import java.util.Scanner;

public class Main {
    public String solution(String str) {
        str = str.toLowerCase();


/*
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return "NO";
            }
            start++;
            end--;
        }

 */
        for (int i = 0; i < str.length() /2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return "NO";
            }

        }
        return "YES";
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
