import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
class Node {
    int level;
    int val;
    Node p5;
    Node p1;
    Node m1;

    public Node(int level, int val) {
        this.level = level;
        this.val = val;
    }
}

public class Main {

    static Queue<Node> queue = new LinkedList<>();
    static boolean[] array = new boolean[10020];
    //static ArrayList<Node> arrayList = new ArrayList<>();


    public void BFS(int end) {
        while (queue.size() != 0) {
            Node node1 = queue.poll();
            if (node1.val == end) {
                System.out.println(node1.level);
                return;
            } else {

                //arrayList.add(node1);
                node1.p5 = new Node(node1.level + 1, node1.val + 5);
                node1.p1 = new Node(node1.level + 1, node1.val + 1);
                node1.m1 = new Node(node1.level + 1, node1.val - 1);

                if (!array[node1.p5.val]) {
                    queue.add(node1.p5);
                }
                if (!array[node1.p1.val]) {
                    queue.add(node1.p1);
                }
                if (!array[node1.m1.val]) {
                    queue.add(node1.m1);
                }

                array[node1.p5.val] = true;
                array[node1.p1.val] = true;
                array[node1.m1.val] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        Node root = new Node(0, start);
        array[start] = true;
        Main main = new Main();
        queue.add(root);
        main.BFS(end);

    }
}
*/
class Main {
    int ans = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int L = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                if (x == e) {
                    return L;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        q.add(nx);
                        ch[nx] = 1;
                    }


                }
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();


        System.out.println(main.BFS(start, end));
    }
}