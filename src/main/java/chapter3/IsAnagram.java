package chapter3;

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class IsAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sHashMap = new HashMap<>();
        Map<Character, Integer> tHashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sHashMap.put(s.charAt(i), sHashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            tHashMap.put(t.charAt(j), tHashMap.getOrDefault(t.charAt(j), 0) + 1);
        }
        return areMapEquals(sHashMap, tHashMap);
    }
    private boolean areMapEquals(Map<Character, Integer> s, Map<Character, Integer> t) {
        if (s.size() != t.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : s.entrySet()) {
            Character c =  entry.getKey();
            Integer v =  entry.getValue();
            if (!t.containsKey(c) || !v.equals(t.get(c))) {
                return false;
            }
        }
        return true;
    }
}
