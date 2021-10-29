import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int fitVal = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        int total = arrayList.get(0);
        int result = 0;
        if (total == result) {
            result++;
        }

        int startPoint = 0;
        // 라스트 포인트는 아직 더하지 않은 값이다.
        int lastPoint = 1;

        while (lastPoint < arrayList.size()) {
            if (total < fitVal) {
                total += arrayList.get(lastPoint);
                lastPoint++;

            } else if (total > fitVal) {
                total -= arrayList.get(startPoint);
                startPoint++;

            } else {
                result++;
                total -= arrayList.get(startPoint);
                startPoint++;
            }
        }
        if (total == fitVal) {
            result++;
        }
        System.out.println(result);
    }
}
