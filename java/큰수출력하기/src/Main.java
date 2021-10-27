import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public void solution(int[] numList, int maxNum) {

        ArrayList<Integer> reusltList = new ArrayList<>();

        for (int i = 2; i < maxNum + 1; i++) {
            boolean isChen = true;
            for (int j = 0; j < reusltList.size(); j++) {
                if (i % reusltList.get(j) == 0) {
                    isChen = false;
                    break;
                }
            }
            if (isChen) {
                reusltList.add(i);
            }
        }
        for (int i = 0; i < numList.length; i++) {
            for (int j = 0; j < reusltList.size(); j++) {
                if (numList[i] == reusltList.get(j)) {
                    System.out.print(numList[i] + " ");
                    break;
                }
            }
        }


    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int maxNum = Integer.MIN_VALUE;
        int[] numList = new int[size];
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            StringBuffer sb = new StringBuffer(Integer.toString(num)).reverse();
            int newNum = Integer.parseInt(sb.toString());
            numList[i] = newNum;
            if (newNum > maxNum) {
                maxNum = newNum;
            }
        }


        main.solution(numList, maxNum);

    }
}
