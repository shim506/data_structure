import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public void solution(ArrayList<Integer> numList) {

        ArrayList<Integer> newList = new ArrayList<>(numList);
        Collections.sort(newList, Collections.reverseOrder());

        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.indexOf(numList.get(i))+1+" ");
        }


    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            numList.add(num);
        }

        main.solution(numList);

    }
}
