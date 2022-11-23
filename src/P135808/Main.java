package P135808;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k = 4; // 사과의 최고 점수
        int m = 3; // 한상자에 들어가는 사과의 수
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        Solution solution = new Solution();
        int answer = solution.solution(k, m, score);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int k, int m, int[] score) {
        int cnt = 1, answer = 0;

        // Collections.reversOrder를 쓰기 위해 Integer형으로 배열을 생성
        Integer[] arr = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            arr[i] = score[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++, cnt++) {
            int sum = 0;
            if (cnt % m == 0) sum = arr[i] * m;
            answer += sum;
        }
        return answer;
    }
}