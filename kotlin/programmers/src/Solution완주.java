import java.util.HashMap;

public class Solution완주 {
    public HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    private HashMap<String, Integer> hashMap1;

    public String solution(String[] participant, String[] completion) {
        for (String person : participant) {
            hashMap.put(person, hashMap.getOrDefault(person, 0) + 1);
        }
        for (String person : completion) {
            if (hashMap.get(person) == 1) hashMap.remove(person);
            else hashMap.replace(person, hashMap.get(person), hashMap.get(person) - 1);
        }
        return hashMap.keySet().iterator().next();
    }
}
