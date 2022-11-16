package P12949;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] answer = sol.solution(arr1, arr2);
        // 출력
        System.out.println(Arrays.deepToString(answer));
    }
}
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int result = 0;
                for (int k = 0; k < arr2.length; k++) {
                    result += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = result;
            }
        }

        return answer;
    }
}