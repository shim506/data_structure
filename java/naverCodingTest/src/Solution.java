import java.util.HashMap;

class Solution {
    public int solution(String[] id_list, int k) {
        int answer = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < id_list.length; i++) {
            String[] arrayList = id_list[i].split(" ");

            for (int j = 0; j < arrayList.length; j++) {
                if (hashMap.get(arrayList[j]) == null) {
                    hashMap.put(arrayList[j], 1);
                } else {
                    int x = hashMap.get(arrayList[j]);
                    if(x < k){
                        hashMap.put(arrayList[j],x++ );
                    }
                }
            }

        }

        for (int i : hashMap.values()) {
            answer+=i;
        }


        return answer;
    }
}