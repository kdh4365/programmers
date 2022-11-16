package P12981;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = sol.solution(n, words);
        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        ArrayList<String> al = new ArrayList<>();
        String word_before = "";
        int people, loop;
        char word_last = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            char word_first = word.charAt(0);
            if (i == 0) word_last = word_first;
            int len = al.size();

            // 중복단어
            if (al.contains(word)) {
                people = (len + 1) % n;
                if (people == 0) people = n;
                loop = (len / n) + 1;
                answer[0] = people;
                answer[1] = loop;
                return answer;
            }

            if (word_first != word_last) {
                people = (len + 1) % n;
                if (people == 0) people = n;
                loop = (len / n) + 1;
                answer[0] = people;
                answer[1] = loop;
                return answer;
            }

            word_before = word;
            word_last = word_before.charAt(word_before.length() - 1);
            al.add(word);
        }
        return answer;
    }
}