import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int N = scanner.nextInt();

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int moveN = scanner.nextInt();
        int[] moveArr = new int[moveN];
        for (int i = 0; i < moveN; i++) {
            moveArr[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < moveN; i++) {
            int move = moveArr[i] - 1;

            int ele = -1;
            for (int j = 0; j < N; j++) {
                if (arr[j][move] != 0) {
                    ele = arr[j][move];
                    arr[j][move] = 0;
                    break;
                }
            }

            // 중복 값을 제거 해준다.
            if (ele != -1) {
                //System.out.println(ele);
                if (stack.peek() == ele) {
                    stack.pop();
                    ans += 2;
                } else {
                    stack.push( ele);
                }
            }
        }

        System.out.println(ans);
    }
}
