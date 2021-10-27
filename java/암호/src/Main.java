import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str, int cnt) {

        String result = "";
        String word;

        int st = 0;


        for (int i = 0; i < cnt; i++) {
           // System.out.println(str.substring(st, st + 7));

            String temp = str.substring(st, st + 7).replace('#' , '1').replace('*' , '0');
            int bitString = Integer.parseInt(temp , 2);
            result += (char)bitString;

            st += 7;
        }
        //System.out.println(strList);


        return result;

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        String str = scanner.next();


       // System.out.println(main.solution(str, cnt));

        Human human = new Human();
        human.increaseAge(20 , human);
        System.out.println(human.age);
        System.out.println(human.getClass());

    }
}
