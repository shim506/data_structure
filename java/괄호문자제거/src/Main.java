import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        String ans = "";
        for (char x : arr.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                stack.pop();
            } else {
                if (stack.empty()) {
                    ans += x;
                }
            }
        }
        System.out.println(ans);
    }
}
