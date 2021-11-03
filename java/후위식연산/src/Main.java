import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = scanner.nextLine();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch);
            } else {
                int x = stack.pop();
                int y = stack.pop();

            }
        }



    }
}
