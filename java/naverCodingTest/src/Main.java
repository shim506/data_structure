import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.solution());

    }

    /*
        public int solution(String[] id_list, int k) {

                int answer = 0;
                HashMap<String, Integer> hashMap = new HashMap<>();


                for (int i = 0; i < id_list.length; i++) {
                    String[] arrayList_ = id_list[i].split(" ");
                    HashSet<String> hashSet = new HashSet<>(Arrays.asList(arrayList_));
                    String[] arrayList = hashSet.toArray(new String[0]);

                    for (int j = 0; j < arrayList.length; j++) {
                        if (hashMap.get(arrayList[j]) == null) {
                            hashMap.put(arrayList[j], 1);
                            System.out.println(arrayList[j] + hashMap.get(arrayList[j]));

                        } else {
                            int x = hashMap.get(arrayList[j]);
                            if (x < k) {
                                x++;
                                hashMap.replace(arrayList[j], x);
                                System.out.println(arrayList[j] + x);
                            }
                        }
                    }

                }

                for (int i : hashMap.values()) {
                    answer += i;
                }


                return answer;
            }*/
    public class Log {
        public String id;
        public String num;
        public String score;


        public Log(String id, String num, String score) {
            this.id = id;
            this.num = num;
            this.score = score;
        }


    }

    public class User {
        ArrayList<String> correctList = new ArrayList<>();
        public int count;
        public String id;

        public User(String id) {
            this.id = id;
        }
    }

    public String[] solution(String[] logs) {
        String[] answer = {};
        HashMap<String, String> logArrayList = new HashMap<>();
        ArrayList<User> users = new ArrayList<>();

        //중복 제거
        for (String str : logs) {
            String[] ele = str.split(" ");
            logArrayList.put(ele[0] + " " + ele[1], ele[2]);
        }
        Iterator<String> it = logArrayList.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String[] ele = key.split(" ");
            ele[2] = logArrayList.get(key);



        }

        //


        return answer;
    }


}
