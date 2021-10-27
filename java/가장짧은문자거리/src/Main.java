import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(String str, char key) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 기준으로 앞뒤로 자르고 두개 비교후 작은값 채택
        for (int i = 0; i < str.length(); i++) {

            String front = str.substring(0, i + 1);
            String back = str.substring(i, str.length());


            StringBuilder sb = new StringBuilder(front).reverse();

            int frontDist = sb.toString().indexOf(key);
            int backDist = back.indexOf(key);


            if (frontDist == -1) {
                frontDist = Integer.MAX_VALUE - 1;
            } else if (backDist == -1) {
                backDist = Integer.MAX_VALUE - 1;
            }

            arrayList.add(Math.min(frontDist, backDist));
        }

        return arrayList;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);


        for (int i : main.solution(str , c)) {
            System.out.print(i + " ");
        }
    }
}
