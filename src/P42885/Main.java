package P42885;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = sol.solution(people, limit);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        boolean[] visit = new boolean[people.length];
        int j = people.length - 1;

        for (int i = 0; i < people.length; i++) {
            for (; j > i; j--) {
                if (people[i] + people[j] <= limit) {
                    answer++;
                    visit[i] = true; visit[j] = true;
                    j--;
                    break;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (!visit[i]) answer++;
        }

        return answer;
    }
}