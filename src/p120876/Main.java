package p120876;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int answer = solution.solution(lines);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int[] line : lines) {
            int min = Math.min(line[0], line[1]);
            int max = Math.max(line[0], line[1]);
            for (int i = min + 1; i < max + 1; i++) {
                String str = (i - 1) + "/" + i;
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        for (Integer value : map.values()) {
            if (value > 1) answer++;
        }

        return answer;
    }
}