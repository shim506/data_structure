import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int size1 = scanner.nextInt();
        for (int i = 0; i < size1; i++) {
            array1.add(scanner.nextInt());
        }
        int size2 = scanner.nextInt();
        for (int i = 0; i < size2; i++) {
            array2.add(scanner.nextInt());
        }

        Collections.sort(array1);
        Collections.sort(array2);
        int cnt1  = 0, cnt2 = 0;

        while (cnt1 < array1.size() && cnt2 < array2.size()){
            if (array1.get(cnt1) < array2.get(cnt2)){
                cnt1++;
            }else if (array1.get(cnt1) > array2.get(cnt2)){
                cnt2++;
            }else{
                result.add(array1.get(cnt1));
                cnt1++;
                cnt2++;
            }
        }



        for (int i : result) {
            System.out.print(i + " ");

        }
        //System.out.println(integers);


    }
}
