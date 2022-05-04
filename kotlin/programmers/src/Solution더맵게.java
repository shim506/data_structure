import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class Solution더뱁게 {

    public int solution(int[] scoville, int K) {
        if(K == 0) return 0;

        int count = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for(int i : scoville){
            heap.add(i);
        }

        while(heap.size() > 1){
            count ++;
            int first = heap.poll();
            int second = heap.poll();
            int mixed = first + second*2;
            heap.add( mixed);
            if(heap.peek() >= K){
                break;
            }
        }
        if(heap.peek() >= K){
            return count;
        }else{
            return -1;
        }
    }
    public void printList(ArrayList<Integer> list ){
        for(int a : list){
            System.out.println(a);
        }
        System.out.println();
    }

}

