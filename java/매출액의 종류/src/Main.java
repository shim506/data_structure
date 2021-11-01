import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int range = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }

        for (int i = 0; i < range; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
        result.add(map.size());
        for (int i = range; i < size; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
            map.put(arr.get(i - range), map.get(arr.get(i-range)) - 1);
            if (map.get(arr.get(i-range)) == 0) {
                map.remove(arr.get(i-range));
            }
            result.add(map.size());
        }

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
