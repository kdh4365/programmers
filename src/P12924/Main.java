package P12924;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;
        int answer = sol.solution(n);
        // 출력
        System.out.println(answer);
    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                }
                else if (sum > n) break;

            }
        }
        return answer;
    }
}