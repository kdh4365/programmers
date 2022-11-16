package P12914;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int answer = sol.solution(n);
        // 출력
        System.out.println(answer);
    }
}
class Solution {
    public int solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1; dp[2] = 2;
        for (int i = 3; i <= 2000; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }
}