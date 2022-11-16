package P42842;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int brown = 10, yellow = 2;
        int[] answer = sol.solution(brown, yellow);
        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int tile = brown + yellow;

        for (int i = 3; i < tile; i++) {
            int j = tile / i;

            if (tile % i == 0 && j >= 3) {
                // 가로가 더 길거나 같다.
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);

                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }
}