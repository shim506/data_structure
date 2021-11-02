import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = (scanner.nextInt());
        int k = (scanner.nextInt());

        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //System.out.println(arr.length);

        TreeSet<Integer> treeSet = new TreeSet<Integer>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : treeSet) {
            cnt++;

            if (k == cnt) {
                System.out.println(x);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
