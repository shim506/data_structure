import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] stringList) {
        ArrayList<String> newList = new ArrayList<>();

        /*
        for (String str : stringList) {
            StringBuffer sb = new StringBuffer(str);
            String reWord = sb.reverse().toString();
            newList.add(reWord);
        }*/
        for (String str : stringList) {
            char[] s = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                char f = s[lt];
                char b = s[rt];

                s[lt] = b;
                s[rt] = f;

                lt++;
                rt--;
            }
            newList.add(String.valueOf(s));
        }
        return newList;
    }

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] strList = new String[N];

        for (int i = 0; i < N; i++) {
            strList[i] = scanner.next();
        }

        ArrayList<String> newStrList = main.solution(N, strList);

        for (String x : newStrList) {
            System.out.println(x);
        }
    }
}
