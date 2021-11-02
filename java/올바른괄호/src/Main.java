import java.util.Scanner;
import java.util.Stack;

public class Main {
// 끝날때 0 이 아니거나
// 중간에 -1 이 되거나
// 괄호에 따라 +1 , -1 을 해준다


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String arr = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char x : arr.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.empty()) {
                    System.out.println("NO");
                    System.exit(0);
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }

}
