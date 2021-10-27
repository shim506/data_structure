import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public String solution(String str) {
        String ans = "";


        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i){
                ans += str.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();


        System.out.println(main.solution(str));
    }
}
