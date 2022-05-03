import java.util.*;


class 전화번호목록 {
    public boolean solution(String[] phoneBook) {
        Map<String, Integer> map = new HashMap<>();

        HashMap<Integer , Integer> x = new HashMap<Integer , Integer>();
        x.put(3 , x.getOrDefault(2 , 0)+1);


        for (int i = 0; i < phoneBook.length; i++) map.put(phoneBook[i], i);
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j))) return false;
        return true;
    }
}

