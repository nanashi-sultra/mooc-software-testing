package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {
        int curr = 0;
        for (int i=0; i < s.length(); i++) {
            int num = map.get(s.charAt(i));
            int next = i + 1;
            if (next < s.length()) {

            } else {
                next = i;
            }
            int next_num = map.get(s.charAt(next));
            if (num >= next_num) {
                curr += num;
            }else {
                curr -= num;
            }
        }
       return  curr;
    }
}
