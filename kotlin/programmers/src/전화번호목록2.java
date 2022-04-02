import java.util.ArrayList;
import java.util.HashMap;

class 전화번호목록2 {
    public HashMap hashMap = new HashMap<Character, ArrayList<String>>();
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String phoneBookStr: phone_book) {
            for (String hashStr: hashMap.)) {

            }
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return answer;

    }
}

//    val answer = true
//        phone_book.forEach { phoneBookStr ->
//                hashMap[phoneBookStr[0]]?.forEach { hashmapStr ->
//                if (phoneBookStr < hashmapStr && phoneBookStr.startsWith(hashmapStr)) return false
//        else if (phoneBookStr > hashmapStr && hashmapStr.startsWith(phoneBookStr)) return false
//        else hashMap[phoneBookStr[0]]?.add(hashmapStr)
//        } ?: run { hashMap[phoneBookStr[0]] = mutableListOf<String>(phoneBookStr) }
//        }
//        return answer