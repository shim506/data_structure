import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int cnt = 0;

    // 1정점에서 5정점으로 감
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            cnt++;
        } else {
            for (int i = 0; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;


        Main main = new Main();

        main.DFS(1);
        System.out.println(cnt);

    }
}
