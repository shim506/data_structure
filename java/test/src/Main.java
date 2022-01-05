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
        String x = "10x^5 + 3x^2 + 5x^1";

        ArrayList<Term> terms = new ArrayList<>();


        String[] expStringList = x.split("\\+");
        for (int i = 0; i < expStringList.length; i++) {
            terms.add(new Term(Integer.parseInt(expStringList[i].substring(0, expStringList[i].indexOf('x'))), Integer.parseInt(expStringList[i].substring(expStringList[i].indexOf('^'), expStringList[i].length() - 1))));
        }



    }


}
