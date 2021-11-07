import java.util.*;

class Node {
    int val;
    Node lt;
    Node rt;


    public Node(int data) {
        this.val = data;
        this.lt = null;
        this.rt = null;
    }
}

public class Main {

    int ans = 0;
    int[] dis = {1, -1, 5};
    int[] ch;

    public int BFS(int x, int y) {
        ch = new int[10001];
        ch[s]
    }
    /*
    Node root;

    static int size = 3;
    static int[] arr = new int[size + 1];

    public static Queue<Node> queue = new LinkedList<>();
    public static ArrayList<Node> rsult = new ArrayList<>();

    public void BFS(Node root) {

        while (!queue.isEmpty()) {

            Node node = queue.poll();
            rsult.add(node);
            if (node.lt != null){
                queue.add(node.lt);
            }
            if (node.rt != null){
                queue.add(node.rt);
            }

        }
        for (Node node : rsult) {
            System.out.println(node.val);
        }
    }

    public void DFS(Node root) {
        // stack 형태로 구현
        if (root.lt != null) {
            DFS(root.lt);
        }

        if (root.rt != null) {
            DFS(root.rt);
        }
        System.out.println(root.val);
    }

    public static void sub(int L) {
        if (L == size + 1) {
            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            arr[L] = 1;
            sub(L + 1);
            arr[L] = 0;
            sub(L + 1);
        }


    }
*/

    public static void main(String[] args) {
/*
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        //tree.DFS(tree.root);


        queue.add(tree.root);
        tree.BFS(tree.root);
        //sub(1);
*/


    }


}
