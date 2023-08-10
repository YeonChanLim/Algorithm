import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        HashMap<Character, String> words = new HashMap<Character, String>() {{
            put('a', "aya");
            put('y', "ye");
            put('w', "woo");
            put('m', "ma");
        }};
        int answer = 0;

        for (String s : babbling) {
            char prev = ' ';
            int i = 0;
            boolean isValid = true;

            while (i < s.length()) {
                if (prev == s.charAt(i)) {
                    isValid = false;
                    break;
                }

                String word = words.getOrDefault(s.charAt(i), "");
                if (word.equals("")) {
                    isValid = false;
                    break;
                }

                String curStr = s.substring(i, Math.min(s.length(), i + word.length()));

                if (curStr.equals(word)) {
                    prev = s.charAt(i);
                    i += word.length();
                } else {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}